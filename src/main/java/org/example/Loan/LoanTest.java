package org.example.Loan;

public class LoanTest {
    public static void main(String[] args) {
LoanInputs ab = new LoanInputs();
Surety surety = new Surety();
surety.suretyName= "Ramesh";
ab.accountHolderName ="Chandu";
ab.accountNumber="44888";
ab.surety= surety;
LoanService loanService = new LoanService();
LoanDetails loanDetails = loanService.loan(ab);
        System.out.println(loanDetails.loanAmount);
        System.out.println(loanDetails.duration);
    }
}
