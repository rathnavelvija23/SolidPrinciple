package com.java.solid.LiskovSubstitution.Solution;

public class StudentAccount implements BankTransactionService{

    @Override
    public String deposit(String accountNo, Long amount) {
        return null;
    }

    @Override
    public String withdraw(String accountNo, Long amount) {
        return null;
    }
}
