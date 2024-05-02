package StreamMapDemo;

import java.util.Date;

public class AccountSummary {
    public String accountNumber;
    public  Date transactionDate;
    public Date valueDate;

    public  String transactionType;

    public String getTransactionType() {
        return transactionType;
    }

    public  String description;
    public  double  balance;

    public double getBalance() {
        return balance;
    }
}
