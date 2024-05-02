package StreamMapDemo;

import java.util.List;
import java.util.Objects;

public class Account {
    public  String accountHolderName;
    public String accountNumber;
    public String  iFCCode;
    public double balance;
    public String branchName;
    public Address bankAddress;
    public User user;

    public List<AccountSummary > summaryList ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber);
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }
}
