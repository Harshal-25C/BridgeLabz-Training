package com.interfaces.DefaultMethodsInInterfaces.PaymentGatewayIntegration;

public class PaymentApp {
    public static void main(String[] args) {
        PaymentProcessor p1 = new UPIProcessor();
        p1.refund(500);

        PaymentProcessor p2 = new CreditCardProcessor();
        p2.refund(1000);
    }
}
