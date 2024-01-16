package com.java.solid.LiskovSubstitution.Solution;

public interface BankTransactionService {

    String deposit(String accountNo,Long amount);
    String withdraw(String accountNo,Long amount);
}
