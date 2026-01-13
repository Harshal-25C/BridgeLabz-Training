package com.day3.SupermarketBillingQueue;

import java.util.*;

public class SmartCheckoutApp {
    public static void main(String[] args) {

        SmartCheckout checkout = new SmartCheckout();

        checkout.addItem("Milk", 40, 10);
        checkout.addItem("Bread", 30, 5);
        checkout.addItem("Eggs", 60, 2);

        checkout.addCustomer(new Customer("Amit",Arrays.asList("Milk", "Bread")));
        checkout.addCustomer(new Customer("Neha",Arrays.asList("Eggs", "Milk", "Eggs")));

        checkout.processNextCustomer();
        checkout.processNextCustomer();
    }
}
