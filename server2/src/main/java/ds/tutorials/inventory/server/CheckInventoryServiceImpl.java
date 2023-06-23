package ds.tutorials.inventory.server;

import ds.tutorial.inventory.grpc.generated.CheckInventoryServiceGrpc;
import ds.tutorial.inventory.grpc.generated.CheckInventoryResponse;

public class CheckInventoryServiceImpl extends CheckInventoryServiceGrpc.CheckInventoryServiceImplBase {

    private ProductServer server;

    public CheckInventoryServiceImpl( ProductServer server){
        this.server = server;
    }

    @Override
    public void checkInventory(ds.tutorial.inventory.grpc.generated.CheckInventoryRequest request,
                             io.grpc.stub.StreamObserver<ds.tutorial.inventory.grpc.generated.CheckInventoryResponse> responseObserver) {

        String productId = request.getProductId();
        System.out.println("Request received..");
        double inventory = getProductInventory(productId);
        CheckInventoryResponse response = CheckInventoryResponse
                .newBuilder()
                .setInventory(inventory)
                .build();
        System.out.println("Responding, inventory for product " + productId + " is " + inventory);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private double getProductInventory(String productId) {
        return server.getProductInventory(productId);
    }
}
