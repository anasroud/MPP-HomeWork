package lab4.E;

public class SavingsAccount extends Account {
    private double balance;
    private double intrestRate;
    private String acctId;

    public SavingsAccount(String acctId , double intrestRate , double StartingBalance) {
        this.intrestRate = intrestRate;
        this.acctId = acctId;
        balance = StartingBalance;
    }

    @Override
    public String getAccountId() {
        return acctId;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double computeUpdatedBalance() {
        return balance + (intrestRate * balance);
    }
}
