package com.multithreading.BankTransactions;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private Map<Integer, Integer> accounts = new HashMap<>();

    public Bank(int accountNumber, int initialBalance) {
        accounts.put(accountNumber, initialBalance);
    }

    //Deposit money
    public synchronized void deposit(int accountNumber, int amount) {
        int balance = accounts.get(accountNumber);
        balance += amount;
        accounts.put(accountNumber, balance);

        System.out.println(Thread.currentThread().getName() +
                " deposited " + amount +
                " | Balance: " + balance);
    }

    //Withdraw money
    public synchronized void withdraw(int accountNumber, int amount) {
        int balance = accounts.get(accountNumber);

        if(balance >= amount) {
            balance -= amount;
            accounts.put(accountNumber, balance);

            System.out.println(Thread.currentThread().getName() +
                    " withdrew " + amount +
                    " | Balance: " + balance);
        }else {
            System.out.println(Thread.currentThread().getName() +
                    " tried to withdraw " + amount +
                    " | Insufficient balance: " + balance);
        }
    }

    //Get balance 
    public synchronized int getBalance(int accountNumber) {
        return accounts.get(accountNumber);
    }
}
