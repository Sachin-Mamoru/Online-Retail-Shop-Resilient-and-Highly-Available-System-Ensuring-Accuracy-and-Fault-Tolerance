package ds.tutorials.communication.client;

import ds.tutorial.inventory.grpc.generated.SetInventoryRequest;
import ds.tutorial.inventory.grpc.generated.SetInventoryResponse;
import ds.tutorial.inventory.grpc.generated.SetInventoryServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class SetInventoryServiceClient
{
    private ManagedChannel channel = null;
    SetInventoryServiceGrpc.SetInventoryServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;

    public SetInventoryServiceClient( String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void initializeConnection () {
        System.out.println("Initializing Connecting to server at " + host + ":" +
                port);
        channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        clientStub = SetInventoryServiceGrpc.newBlockingStub(channel);
    }
    public void closeConnection() {
        channel.shutdown();
    }

    public void processUserRequests() throws InterruptedException {
        while (true) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("\nEnter Product ID, amount to set the Inventory :");
            String input[] = userInput.nextLine().trim().split(",");
            String productId = input[0];
            double amount = Double.parseDouble(input[1]);
            System.out.println("Requesting server to set the product Inventory to " + amount + " for " + productId.toString());
            SetInventoryRequest request = SetInventoryRequest
                    .newBuilder()
                    .setProductId(productId)
                    .setValue(amount)
                    .setIsSentByPrimary(false)
                    .build();
            SetInventoryResponse response = clientStub.setInventory(request);
            System.out.printf("Transaction Status " + (response.getStatus() ? "Sucessful" : "Failed"));
            Thread.sleep(1000);
        }
    }

    public void processUserRequests(String productId, double amount) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            try {
                SetInventoryRequest request = SetInventoryRequest.newBuilder()
                                                                 .setProductId(productId)
                                                                 .setValue(amount)
                                                                 .setIsSentByPrimary(false)
                                                                 .build();
                SetInventoryResponse response = clientStub.setInventory(request);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Handle the InterruptedException here
                System.out.println("Processing interrupted: " + e.getMessage());
                Thread.currentThread().interrupt(); // Reset interrupted status
            }
        }
    }

}
