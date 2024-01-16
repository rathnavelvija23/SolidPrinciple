package com.java.solid.SingleResponsibility;

public class BankService {

    public long deposit(String accountNo, long amount){
        //Deposit amount Logic
        System.out.println("Amount deposited");
        return 0;
    }

    public long withdraw(String accountNo, long amount){
        //Withdraw amount Logic
        System.out.println("Amount deposited");
        return 0;
    }


    //Moving this to new service
   /*

   public void printPassBook(String accountNo){
        //prints passbook
        System.out.println("Prints Passbook");
    }

    */

    public String getLoan(String accountNo, String loanType){
        if(loanType.equals("car")){return "Car Loan Sanctioned"; }
        if(loanType.equals("home")){return "Home Loan Sanctioned"; }
        if(loanType.equals("personal")){return "Personal Loan Sanctioned"; }

        return "Loan Not Sanctioned";
    }

}
