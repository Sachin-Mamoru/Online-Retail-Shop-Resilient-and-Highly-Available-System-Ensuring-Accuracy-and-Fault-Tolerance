package ds.tutorials.communication.client.model;

import ds.tutorial.communication.grpc.generated.CheckBalanceResponse;

public class BalanceResponse
{
    private CheckBalanceResponse checkBalanceResponse;
    private String accountId;

    public BalanceResponse( CheckBalanceResponse checkBalanceResponse, String accountId )
    {
        this.checkBalanceResponse = checkBalanceResponse;
        this.accountId = accountId;
    }

    public CheckBalanceResponse getCheckBalanceResponse()
    {
        return checkBalanceResponse;
    }

    public void setCheckBalanceResponse( CheckBalanceResponse checkBalanceResponse )
    {
        this.checkBalanceResponse = checkBalanceResponse;
    }

    public String getAccountId()
    {
        return accountId;
    }

    public void setAccountId( String accountId )
    {
        this.accountId = accountId;
    }
}
