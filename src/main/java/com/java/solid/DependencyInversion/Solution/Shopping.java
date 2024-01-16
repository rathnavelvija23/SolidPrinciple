package com.java.solid.DependencyInversion.Solution;

public class Shopping {

    public Shopping(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    private BankCard bankCard;



    public static void main(String[] args) {
        BankCard debitCard= new DebitCard();
        Shopping debit= new Shopping(debitCard);
        debit.bankCard.doTransaction("1");


    }
}
