package com.interfaces.ImplementingInterfaces.DigitalPaymentInterface;

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card");
    }
}
