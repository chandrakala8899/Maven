package StreamMapDemo;

import java.util.*;

public class AccountService {
    public Map<Account,Account> getMap1(){
       Map<Account, Account> accountMap = new HashMap<>();
        Address address1 = new Address();
        address1.FlatNo= "2-164";
        address1.area = "Manopad";
        address1.state = "TG";
        address1.country= "India";
        address1.pincode = "509125";

        Address address2 = new Address();
        address2.FlatNo= "3-142";
        address2.area = "Amaravai";
        address2.state = "TG";
        address2.country= "India";
        address2.pincode = "509125";


        User user = new User();
        user.accountHolderName = "Chandu";
        user.dOb = "31-01-2002";
        user.userAddress= address1;
     Account account = new Account();
     account.accountNumber= "3344556";
     account.accountHolderName = "Chandu";
     account.iFCCode = "SBIN00611";
     account.branchName = "Amaravai";
     account.balance = 5000000;
     account.bankAddress = address2;
     account.user = user;

        AccountSummary accountSummary1 = new AccountSummary();
        accountSummary1.balance = 1000;
        accountSummary1.transactionType = "Debit";
        accountSummary1.valueDate = new Date();
        accountSummary1.transactionDate = new Date();
        accountSummary1.description = "College Fee   " ;
        accountSummary1.accountNumber= account.accountNumber;

     AccountSummary accountSummary2 = new AccountSummary();
     accountSummary2.balance = 5000;
     accountSummary2.transactionType = "Debit";
     accountSummary2.valueDate = new Date();
     accountSummary2.transactionDate = new Date();
     accountSummary2.description = "  BirthadayFee " ;
     accountSummary2.accountNumber= account.accountNumber;

     AccountSummary accountSummary3 = new AccountSummary();
     accountSummary3.balance = 5000;
     accountSummary3.transactionType = "Credit";
     accountSummary3.valueDate = new Date();
     accountSummary3.transactionDate = new Date();
     accountSummary3.description = " S  " ;
     accountSummary3.accountNumber= account.accountNumber;

     AccountSummary accountSummary4= new AccountSummary();
     accountSummary4.balance = 2000;
     accountSummary4.transactionType = "Credit";
     accountSummary4.valueDate = new Date();
     accountSummary4.transactionDate = new Date();
     accountSummary4.description = "   " ;
     accountSummary4.accountNumber= account.accountNumber;



     List<AccountSummary> summaryList = new ArrayList<>();
     summaryList.add(accountSummary1);
     summaryList.add(accountSummary2);
     summaryList.add(accountSummary3);
     summaryList.add(accountSummary4);

     account.summaryList = summaryList;

     Map<Account,Account>accountAccountMap = new HashMap<>();
     accountAccountMap.put(account,account);

     return accountAccountMap;
    }
}
