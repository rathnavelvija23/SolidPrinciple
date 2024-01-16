package com.java.solid.LiskovSubstitution;

public abstract class BankServiceLiskovBreakit {

    public abstract String deposit(String accountNo,Long amount);
    public abstract String withdraw(String accountNo,Long amount);
    //Not applicable for the person age under 18
    public abstract String getCarLoan(String accountNo,Long amount);

}
