package com.java.solid.OpenClosed;

public class LoanServiceBreaktheprinciple {

    public String getLoan(String accountNo, String loanType){
        if(loanType.equals("car")){return "Car Loan Sanctioned"; }
        if(loanType.equals("home")){return "Home Loan Sanctioned"; }
        //Newly added for personal Loan. We shold not keep on adding this and we can extend it but not modify the others
        if(loanType.equals("personal")){return "Personal Loan Sanctioned"; }

        return "Loan Not Sanctioned";
    }
}
