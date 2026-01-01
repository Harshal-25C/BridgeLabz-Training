package com.day1;


//Parent class representing a generic bank account
class Account3{
	protected int accountNumber;
    protected double balance;

    // Constructor to initialize account details
    Account3(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Common deposit method for all accounts
    public void deposit(double amount) {
        balance += amount;
    }

    // Common withdraw method with validation
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Method to display account details
    public void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}