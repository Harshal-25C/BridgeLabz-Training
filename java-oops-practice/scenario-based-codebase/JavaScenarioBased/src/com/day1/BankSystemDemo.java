package com.day1;

public class BankSystemDemo{
    public static void main(String[] args){
        //Creating a savings account
        SavingsAccount sa = new SavingsAccount(10000, 5);

        // Assigning account to customer
        Customer c1 = new Customer("Harshal", sa);

        // Performing operations
        sa.deposit(2000);
        sa.addInterest();

        // Displaying customer details
        c1.displayCustomerInfo();

        System.out.println();

        // Creating a current account
        CurrentAccount ca = new CurrentAccount(8000);
        Customer c2 = new Customer("Amit", ca);

        ca.withdraw(3000);
        c2.displayCustomerInfo();
    }
}