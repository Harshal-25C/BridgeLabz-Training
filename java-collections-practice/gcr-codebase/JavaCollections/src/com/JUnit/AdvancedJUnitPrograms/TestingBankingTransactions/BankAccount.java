package com.JUnit.AdvancedJUnitPrograms.TestingBankingTransactions;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }else {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if(amount > balance) {
            return false; //insufficient funds
        }
        if(amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }
}
