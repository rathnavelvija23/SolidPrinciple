package com.java.solid.LiskovSubstitution;

public class CurrentAccount extends BankServiceLiskovBreakit{
    @Override
    public String deposit(String accountNo, Long amount) {
        return null;
    }

    @Override
    public String withdraw(String accountNo, Long amount) {
        return null;
    }

    //This one can substitue the base class
    @Override
    public String getCarLoan(String accountNo, Long amount) {
        return null;
    }

    public String value = "new";
}
