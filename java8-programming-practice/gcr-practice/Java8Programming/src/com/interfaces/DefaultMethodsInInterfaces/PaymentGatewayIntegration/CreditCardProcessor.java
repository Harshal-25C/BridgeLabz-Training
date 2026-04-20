package com.interfaces.DefaultMethodsInInterfaces.PaymentGatewayIntegration;

class CreditCardProcessor implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " via Credit Card");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of Rs." + amount + " via Credit Card");
    }
}
