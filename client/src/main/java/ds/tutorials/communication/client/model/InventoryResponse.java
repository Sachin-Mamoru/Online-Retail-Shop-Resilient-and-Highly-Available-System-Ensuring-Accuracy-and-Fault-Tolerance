package ds.tutorials.communication.client.model;

import ds.tutorial.inventory.grpc.generated.CheckInventoryResponse;

public class InventoryResponse
{
    private CheckInventoryResponse checkInventoryResponse;
    private String productId;
    private double quantity;
    private boolean isAvailable;
    private double cost;

    public CheckInventoryResponse getCheckInventoryResponse()
    {
        return checkInventoryResponse;
    }

    public void setCheckInventoryResponse( CheckInventoryResponse checkInventoryResponse )
    {
        this.checkInventoryResponse = checkInventoryResponse;
    }

    public boolean isAvailable()
    {
        return isAvailable;
    }

    public String getProductId()
    {
        return productId;
    }

    public double getQuantity()
    {
        return quantity;
    }

    public void setQuantity( double quantity )
    {
        this.quantity = quantity;
    }

    public void setProductId( String productId )
    {
        this.productId = productId;
    }

    public void setAvailable( boolean available )
    {
        isAvailable = available;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost( double cost )
    {
        this.cost = cost;
    }
}
