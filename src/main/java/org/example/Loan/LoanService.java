package org.example.Loan;

public class LoanService {


    public LoanDetails loan(LoanInputs inputs){
        LoanDetails loanDetails = new LoanDetails();
        loanDetails.accountHolderName= inputs.accountHolderName;
        loanDetails.accountNumber = inputs.accountNumber;
        loanDetails.loanAmount = 100000;
        loanDetails.duration = 12;
        loanDetails.intrest= 0.2;
        return loanDetails;
    }


}
