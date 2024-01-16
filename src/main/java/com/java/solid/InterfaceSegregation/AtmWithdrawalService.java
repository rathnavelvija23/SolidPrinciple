package com.java.solid.InterfaceSegregation;

public class AtmWithdrawalService implements BankServiceInterfaceSegregationBreakit {
    @Override
    public String deposit(String accountNo, Long amount) {
        return null;
    }

    //This is unrelevant to this class
    @Override
    public String withdraw(String accountNo, Long amount) {
        return null;
    }
}
