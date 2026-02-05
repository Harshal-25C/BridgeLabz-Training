package com.multithreading.BankTransactions;

public class Main {

    public static void main(String[] args) {

        int accountNumber = 101;
        Bank bank = new Bank(accountNumber, 2000);

        Customer c1 = new Customer("Customer-1", bank, accountNumber);
        Customer c2 = new Customer("Customer-2", bank, accountNumber);
        Customer c3 = new Customer("Customer-3", bank, accountNumber);

        //Start threads
        c1.start();
        c2.start();
        c3.start();

        //Wait for all threads to finish
        try{
            c1.join();
            c2.join();
            c3.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nFinal Balance: " + bank.getBalance(accountNumber));
    }
}
