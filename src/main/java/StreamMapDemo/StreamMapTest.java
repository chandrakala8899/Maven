package StreamMapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingDouble;

public class StreamMapTest {
    public static void main (String [] args) {
        AccountService accountService = new AccountService();
        Map<Account ,Account> accountMap = accountService.getMap1();


        Account account = new Account();
        account.accountNumber = "3344556";

        Account fullAccount= accountMap.get(account);
        System.out.println(fullAccount.accountNumber);

        Predicate<AccountSummary> creditPredicate = (accountSummary) ->
                accountSummary.transactionType.equals("Credit");

        List<AccountSummary> creditAccountSummary= fullAccount.summaryList.stream().
                filter( accountSummary -> creditPredicate.test(accountSummary)).collect(Collectors.toList());

        System.out.println("Account Details " + creditAccountSummary);

        List<AccountSummary> accountSummaryList = new ArrayList<>();
        for(int i=0;i<fullAccount.summaryList.size();i++){
         if(fullAccount.summaryList.get(i).transactionType.equals("Credit")){
             accountSummaryList.add(fullAccount.summaryList.get(i)) ;
         }
        }
        System.out.println("Account Details"  +accountSummaryList);
       Map<String,Double> creditSum=  fullAccount.summaryList.stream().
               collect(groupingBy(AccountSummary::getTransactionType,summingDouble(AccountSummary::getBalance)));
        System.out.println(creditSum);
        double crfedit= 0;
        double debit =0;

        for(int i=0;i<fullAccount.summaryList.size();i++){
            if(fullAccount.summaryList.get(i).transactionType.equals("Credit")){
           AccountSummary accountSummaryCredit=fullAccount.summaryList.get(i) ;
           crfedit=crfedit+accountSummaryCredit.balance;
            }else if (fullAccount.summaryList.get(i).transactionType.equals("Debit"))
            {
                AccountSummary accountSummaryCredit=fullAccount.summaryList.get(i) ;
                debit=debit+accountSummaryCredit.balance;

            }
        }
        System.out.println("CREDIT " + crfedit);
        System.out.println("DEBIT " + debit);
    }

}
