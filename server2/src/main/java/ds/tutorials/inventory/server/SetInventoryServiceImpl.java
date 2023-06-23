package ds.tutorials.inventory.server;

import ds.tutorial.inventory.grpc.generated.SetInventoryRequest;
import ds.tutorial.inventory.grpc.generated.SetInventoryResponse;
import ds.tutorial.inventory.grpc.generated.SetInventoryServiceGrpc;
import ds.tutorials.sycnhronization.DistributedTxCoordinator;
import ds.tutorials.sycnhronization.DistributedTxListener;
import ds.tutorials.sycnhronization.DistributedTxParticipant;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.apache.zookeeper.KeeperException;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class SetInventoryServiceImpl extends SetInventoryServiceGrpc.SetInventoryServiceImplBase implements DistributedTxListener {
    private ManagedChannel channel = null;
    SetInventoryServiceGrpc.SetInventoryServiceBlockingStub clientStub = null;
    private ProductServer server;

    private Map.Entry<String, Double> tempDataHolder;
    private boolean transactionStatus = false;

    public SetInventoryServiceImpl( ProductServer server){
        this.server = server;
    }

    private void startDistributedTx(String productId, double value) {
        try {
            server.getTransaction().start(productId, String.valueOf(UUID.randomUUID()));
            tempDataHolder = new AbstractMap.SimpleEntry<>(productId, value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setInventory(ds.tutorial.inventory.grpc.generated.SetInventoryRequest request,
                           io.grpc.stub.StreamObserver<ds.tutorial.inventory.grpc.generated.SetInventoryResponse> responseObserver) {

        String productId = request.getProductId();
        double value = request.getValue();
        if (server.isLeader()){
            // Act as primary
            try {
                System.out.println("Updating Product Inventory as Primary");
                startDistributedTx(productId, value);
                updateSecondaryServers(productId, value);
                System.out.println("going to perform");
                if (value > 0){
                    ((DistributedTxCoordinator)server.getTransaction()).perform();
                } else {
                    ((DistributedTxCoordinator)server.getTransaction()).sendGlobalAbort();
                }
            } catch (Exception e) {
                System.out.println("Error while updating the product Inventory" + e.getMessage());
                e.printStackTrace();
            }
        } else {
            // Act As Secondary
            if (request.getIsSentByPrimary()) {
                System.out.println("Updating product Inventory on secondary, on Primary's command");
                startDistributedTx(productId, value);
                if (value != 0.0d) {
                    ((DistributedTxParticipant)server.getTransaction()).voteCommit();
                } else {
                    ((DistributedTxParticipant)server.getTransaction()).voteAbort();
                }
            } else {
                SetInventoryResponse response = callPrimary(productId, value);
                if (response.getStatus()) {
                    transactionStatus = true;
                }
            }
        }
        SetInventoryResponse response = SetInventoryResponse
                .newBuilder()
                .setStatus(transactionStatus)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private void updateInventory() {
        if (tempDataHolder != null) {
            String productId = tempDataHolder.getKey();
            double value = tempDataHolder.getValue();
            server.setProductInventory(productId, value);
            System.out.println("product " + productId + " updated to value " + value + " committed");
            tempDataHolder = null;
        }
    }

    private SetInventoryResponse callServer(String productId, double value, boolean isSentByPrimary, String IPAddress, int port) {
        System.out.println("Call Server " + IPAddress + ":" + port);
        channel = ManagedChannelBuilder.forAddress(IPAddress, port)
                .usePlaintext()
                .build();
        clientStub = SetInventoryServiceGrpc.newBlockingStub(channel);

        SetInventoryRequest request = SetInventoryRequest
                .newBuilder()
                .setProductId(productId)
                .setValue(value)
                .setIsSentByPrimary(isSentByPrimary)
                .build();
        SetInventoryResponse response = clientStub.setInventory(request);
        return response;
    }

    private SetInventoryResponse callPrimary(String productId, double value) {
        System.out.println("Calling Primary server");
        String[] currentLeaderData = server.getCurrentLeaderData();
        String IPAddress = currentLeaderData[0];
        int port = Integer.parseInt(currentLeaderData[1]);
        return callServer(productId, value, false, IPAddress, port);
    }

    private void updateSecondaryServers(String productId, double value) throws KeeperException, InterruptedException {
        System.out.println("Updating other servers");
        List<String[]> othersData = server.getOthersData();
        for (String[] data : othersData) {
            String IPAddress = data[0];
            int port = Integer.parseInt(data[1]);
            callServer(productId, value, true, IPAddress, port);
        }
    }

    @Override
    public void onGlobalCommit() {
        updateInventory();
    }

    @Override
    public void onGlobalAbort() {
        tempDataHolder = null;
        System.out.println("Transaction Aborted by the Coordinator");
    }
}
