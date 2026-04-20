package com.day1;

class SavingsAccount extends Account {
	double interestRate;

    SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    // Method specific to savings account
    void addInterest() {
        balance += balance * interestRate / 100;
    }
}