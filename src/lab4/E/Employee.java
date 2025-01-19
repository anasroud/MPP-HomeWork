package lab4.E;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Account> accounts;

    public Employee(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public Account addAccount (Account acct){
    accounts.add(acct);
    return acct;
    }

    public double computeUpdatedBalanceSum() {
        double sum = 0;
        for(Account acct : accounts){
            sum+= acct.computeUpdatedBalance();
        }
        return sum;
    }
}
