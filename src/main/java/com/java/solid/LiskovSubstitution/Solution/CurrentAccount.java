package com.java.solid.LiskovSubstitution.Solution;


public class CurrentAccount implements BankTransactionService,BankLoanService {

    @Override
    public String deposit(String accountNo, Long amount) {
        return null;
    }

    @Override
    public String withdraw(String accountNo, Long amount) {
        return null;
    }

    @Override
    public String getCarLoan(String accountNo, Long amount) {
        return null;
    }
}
