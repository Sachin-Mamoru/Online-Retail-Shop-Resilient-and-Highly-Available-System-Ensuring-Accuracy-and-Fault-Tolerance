package ds.tutorials.communication.client;

import ds.tutorial.inventory.grpc.generated.CheckInventoryRequest;
import ds.tutorial.inventory.grpc.generated.CheckInventoryResponse;
import ds.tutorial.inventory.grpc.generated.CheckInventoryServiceGrpc;
import ds.tutorials.communication.client.model.InventoryResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Scanner;

public class CheckInventoryServiceClient
{
    private ManagedChannel channel = null;
    CheckInventoryServiceGrpc.CheckInventoryServiceBlockingStub clientStub = null;
    String host = null;
    int port = -1;
    double productCost = 100.00;

    public CheckInventoryServiceClient( String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void initializeConnection () {
        System.out.println("Initializing Connecting to server at " + host + ":" +
                port);
        channel = ManagedChannelBuilder.forAddress("localhost", port)
                .usePlaintext()
                .build();
        clientStub = CheckInventoryServiceGrpc.newBlockingStub(channel);
    }
    public void closeConnection() {
        channel.shutdown();
    }


    public InventoryResponse processUserRequests() throws InterruptedException {
        while (true) {
            Scanner userInput = new Scanner(System.in);
            System.out.println("\nEnter Product ID, and the amount to be bought :");
            String input[] = userInput.nextLine().trim().split(",");
            String productId = input[0];
            double amount = Double.parseDouble(input[1]);
            System.out.println("Requesting server to get the product Inventory to " + amount + " for " + productId.toString());
            CheckInventoryRequest request = CheckInventoryRequest
                                                  .newBuilder()
                                                  .setProductId(productId)
                                                  .build();
            System.out.println("\n");
            CheckInventoryResponse response = clientStub.checkInventory(request);
            System.out.println("\n");
            System.out.printf("My Inventory is " + response.getInventory() + " Products \n");
            InventoryResponse inventoryResponse = new InventoryResponse();
            inventoryResponse.setCheckInventoryResponse( response );
            System.out.println("Processing....\n");
            if (response.getInventory() >= amount) {
                System.out.printf("I can sell " + amount + " of " + productId + " for " + productCost * amount + " LKR\n");
                inventoryResponse.setCost( productCost * amount);
                inventoryResponse.setAvailable( true );
                inventoryResponse.setProductId( productId );
                inventoryResponse.setQuantity( amount );
            } else {
                System.out.printf("I can't sell " + amount + " of " + productId + " for " + productCost * amount + " LKR\n");
                System.out.println("I only have " + response.getInventory() + " of " + productId);
                inventoryResponse.setCost( 0.0 );
                inventoryResponse.setAvailable( false );
            }
            Thread.sleep(1000);
            return inventoryResponse;
        }
    }

}