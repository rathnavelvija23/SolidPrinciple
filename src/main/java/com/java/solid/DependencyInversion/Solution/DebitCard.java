package com.java.solid.DependencyInversion.Solution;

public class DebitCard implements BankCard{
    public void doTransaction(String accountNo){
        System.out.println("Debit Card Transaction");
    }
}
