package com.java.design.behavioural.Strategic;


interface Paymentmethod{
    void pay(int amount);
}

class CreditCardPayment implements Paymentmethod{

    @Override
    public void pay(int amount) {
        System.out.println("payment successful- Source Credit card::"+ amount);
    }
}

class DebitCardPayment implements Paymentmethod{

    @Override
    public void pay(int amount) {
        System.out.println("payment successful- Source Debit card::"+ amount);
    }
}


class POS{
    private Paymentmethod paymentmethod;
    void setPaymentmethod(Paymentmethod paymentmethod) {
        this.paymentmethod = paymentmethod;
    }
    void swipe(int amount){
            paymentmethod.pay(amount);
        }


}
public class Strategicdesignpattern {
    public static void main(String[] args) {
        POS pos = new POS();
        pos.setPaymentmethod(new CreditCardPayment());
        pos.swipe(200);
        pos.setPaymentmethod(new DebitCardPayment());
        pos.swipe(300);
    }


}
