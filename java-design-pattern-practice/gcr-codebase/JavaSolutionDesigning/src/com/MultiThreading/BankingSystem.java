package com.MultiThreading;

import java.time.LocalTime;

class BankAccount {

    private int balance = 10000;

    public int getBalance() {
        return balance;
    }

    // Intentionally NOT synchronized (to observe race condition)
    public boolean withdraw(int amount) {
        if(balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class Transaction implements Runnable {

    private BankAccount account;
    private int amount;
    private String customer;

    public Transaction(BankAccount account, int amount, String customer) {
        this.account = account;
        this.amount = amount;
        this.customer = customer;
    }

    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread().getName() +
                "] Attempting to withdraw " + amount);

        boolean success = account.withdraw(amount);

        if(success) {
            System.out.println("Transaction successful: " + customer +
                    ", Amount: " + amount +
                    ", Balance: " + account.getBalance() +
                    ", Time: " + LocalTime.now());
        }else {
            System.out.println("Transaction failed: " + customer +
                    ", Insufficient balance");
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        int[] amounts = {3000, 4000, 2000, 5000, 1500};

        for(int i=0; i<amounts.length; i++) {
            Thread t = new Thread(
                    new Transaction(account, amounts[i], "Customer-" + (i+1)),
                    "Customer-" + (i + 1)
            );
            System.out.println(t.getName() + " state: " + t.getState());
            t.start();
        }
    }
}
