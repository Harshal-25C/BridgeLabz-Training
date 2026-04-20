package com.interfaces.ImplementingInterfaces.DigitalPaymentInterface;

class Wallet implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Wallet");
    }
}
