package com.day1;

public class Customer{
    String name;
    Account account;

    //Constructor to assign account to customer
    Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    //Display customer details
    void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Account Balance: " + account.balance);
    }
}
