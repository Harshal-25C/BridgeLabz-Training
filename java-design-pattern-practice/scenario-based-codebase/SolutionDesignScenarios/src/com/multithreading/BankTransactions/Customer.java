package com.multithreading.BankTransactions;

public class Customer extends Thread {

    private Bank bank;
    private int accountNumber;

    public Customer(String name, Bank bank, int accountNumber) {
        super(name);
        this.bank = bank;
        this.accountNumber = accountNumber;
    }

    @Override
    public void run() {

        bank.deposit(accountNumber, 1000);
        bank.withdraw(accountNumber, 500);
        bank.deposit(accountNumber, 700);
        bank.withdraw(accountNumber, 1200);
    }
}
