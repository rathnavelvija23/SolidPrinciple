package com.java.solid.DependencyInversion.Solution;

public class CreditCard implements BankCard {
    public void doTransaction(String accountNo){
        System.out.println("Credit Card Transaction");
    }
}
