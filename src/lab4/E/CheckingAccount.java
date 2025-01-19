package lab4.E;

public class CheckingAccount extends Account {

    private double balance;
    private double monthlyFee;
    private String acctId;

    public CheckingAccount( String acctId ,double monthlyFee,  double StartingBalance) {
        this.monthlyFee = monthlyFee;
        this.acctId = acctId;
        balance = StartingBalance;
    }

    @Override
    public String getAccountId() {
        return acctId;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public double computeUpdatedBalance() {
        return balance - monthlyFee;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }
    public String getAcctId() {
        return acctId;
    }
}
