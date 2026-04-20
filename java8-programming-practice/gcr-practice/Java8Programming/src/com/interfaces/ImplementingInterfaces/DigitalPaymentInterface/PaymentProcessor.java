package com.interfaces.ImplementingInterfaces.DigitalPaymentInterface;

public class PaymentProcessor {
    public static void main(String[] args) {

        Payment payment = new UPI();
        payment.pay(1500);

        payment = new CreditCard();
        payment.pay(2500);
    }
}
