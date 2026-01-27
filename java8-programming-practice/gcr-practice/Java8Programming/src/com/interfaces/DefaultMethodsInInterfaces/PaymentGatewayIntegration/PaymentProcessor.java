package com.interfaces.DefaultMethodsInInterfaces.PaymentGatewayIntegration;

interface PaymentProcessor {

    void pay(double amount);

    default void refund(double amount) {
        System.out.println("Refund of Rs." + amount + " processed (default)");
    }
}
