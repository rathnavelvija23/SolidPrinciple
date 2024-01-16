package com.java.solid.DependencyInversion;

public class DependencyInversionBreakIt {

    private DebitCard debitCard;
    private CreditCard creditCard;

    public DependencyInversionBreakIt(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public DependencyInversionBreakIt(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public static void main(String[] args) {
        DebitCard debitCard= new DebitCard();
        DependencyInversionBreakIt debit= new DependencyInversionBreakIt(debitCard);

        CreditCard creditCard= new CreditCard();
        DependencyInversionBreakIt credit= new DependencyInversionBreakIt(creditCard);

    }
}
