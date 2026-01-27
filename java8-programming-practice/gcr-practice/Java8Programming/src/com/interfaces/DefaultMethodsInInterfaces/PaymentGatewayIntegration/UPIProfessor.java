package com.interfaces.DefaultMethodsInInterfaces.PaymentGatewayIntegration;

class UPIProcessor implements PaymentProcessor {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " via UPI");
    }
}
