package com.day1;

public class BankOOPDesignDemo {
    public static void main(String[] args) {

        // Parent reference holding child object (polymorphism)
        Account3 acc1 = new SavingsAccount3(101, 10000, 5);
        acc1.deposit(2000);

        // Interface reference
        Transaction t = (Transaction) acc1;
        t.calculateInterest();

        acc1.display();

        System.out.println();

        Account3 acc2 = new CurrentAccount3(102, 8000);
        acc2.withdraw(3000);
        acc2.display();
    }
}