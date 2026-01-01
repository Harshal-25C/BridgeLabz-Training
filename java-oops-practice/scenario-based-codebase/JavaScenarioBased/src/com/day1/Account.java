package com.day1;

//Base class representing a generic bank account
class Account{
	double balance;

    // Constructor to initialize balance
    Account(double balance) {
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

