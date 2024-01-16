package com.java.solid.LiskovSubstitution;

public class StudentAccount extends BankServiceLiskovBreakit{
    @Override
    public String deposit(String accountNo, Long amount) {
        return null;
    }

    @Override
    public String withdraw(String accountNo, Long amount) {
        return null;
    }

    //If we remove the BankServiceLiskovBreakit - Parent class. Child class cannot substitue it
    @Override
    public String getCarLoan(String accountNo, Long amount) {
        return null;
    }
}
