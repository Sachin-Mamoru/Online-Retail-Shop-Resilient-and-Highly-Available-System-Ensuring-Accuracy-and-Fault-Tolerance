package ds.tutorials.communication.client;

import ds.tutorial.communication.grpc.generated.CheckBalanceResponse;
import ds.tutorial.inventory.grpc.generated.CheckInventoryResponse;
import ds.tutorials.communication.client.model.BalanceResponse;
import ds.tutorials.communication.client.model.InventoryResponse;

public class MainClass {
    public static void main(String[] args) throws InterruptedException {

        if (args.length > 4 || args.length < 3) {
            System.out.println("Usage <host> <port> <s(et)|c(heck)");
            System.exit(1);
        }

        String host = args[0];
        int port = Integer.parseInt(args[1].trim());
        String operation = args[2];

        if (args.length == 4) {
            int portBank = Integer.parseInt(args[2].trim());

            CheckInventoryServiceClient inventoryServiceClient = new CheckInventoryServiceClient(host, port);
            inventoryServiceClient.initializeConnection();
            InventoryResponse cir = inventoryServiceClient.processUserRequests();
            Thread.sleep(3000);
            if (cir.isAvailable()) {
                CheckBalanceServiceClient client = new CheckBalanceServiceClient(host, portBank);
                client.initializeConnection();
                BalanceResponse cbr = client.processUserRequests();
                if (cir.getCost() <= cbr.getCheckBalanceResponse().getBalance()) {
                    System.out.println( "Payment proceeded for the " + cir.getProductId() + "  of " + cir.getQuantity() + " for " + cir.getCost() + " LKR" );
                    SetBalanceServiceClient setBalanceServiceClient = new SetBalanceServiceClient( host, portBank );
                    setBalanceServiceClient.initializeConnection();
                    System.out.println("Account: " + cbr.getAccountId());
                    System.out.println("Balance: " + cbr.getCheckBalanceResponse().getBalance());
                    System.out.println("Remain: " + ( cbr.getCheckBalanceResponse().getBalance() - cir.getCost() ));
                    setBalanceServiceClient.processUserRequests( cbr.getAccountId(), ( cbr.getCheckBalanceResponse().getBalance() - cir.getCost() ) );
                    setBalanceServiceClient.closeConnection();
                    SetInventoryServiceClient setInventoryServiceClient = new SetInventoryServiceClient( host, port );
                    setInventoryServiceClient.initializeConnection();
                    System.out.println( "\nQuantity: Product - " + cir.getProductId() + "  of " + cir.getQuantity());
                    System.out.println( "Inventory: Product - " + cir.getProductId() + "  of " + cir.getCheckInventoryResponse().getInventory());
                    System.out.println("Remain: " + ( cir.getCheckInventoryResponse().getInventory() - cir.getQuantity() ));
                    setInventoryServiceClient.processUserRequests( cir.getProductId(), ( cir.getCheckInventoryResponse().getInventory() - cir.getQuantity() ) );
                    setInventoryServiceClient.closeConnection();
                } else {
                    System.out.println( "Insufficient balance to proceed the payment" );
                }
                client.closeConnection();
            } else {
                System.out.println("Insufficient inventory to proceed the payment");
            }
            inventoryServiceClient.closeConnection();
        } else if ("sp".equals(operation)) {
            SetInventoryServiceClient client = new SetInventoryServiceClient(host, port);
            client.initializeConnection();
            client.processUserRequests();
            client.closeConnection();
        } else if ("s".equals(operation)) {
            SetBalanceServiceClient client = new SetBalanceServiceClient(host, port);
            client.initializeConnection();
            client.processUserRequests();
            client.closeConnection();
        } else {
            CheckBalanceServiceClient client = new CheckBalanceServiceClient(host,
                    port);
            client.initializeConnection();
            client.processUserRequests();
            client.closeConnection();
        }
    }

}
