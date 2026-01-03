package com.day3.MyBank;

abstract class Account implements ITransaction{
 protected String accountNumber;
 private double balance; //Encapsulated

 //Constructor with opening balance
 Account(String accountNumber, double balance){
     this.accountNumber=accountNumber;
     this.balance=balance;
 }

 //Constructor without opening balance
 Account(String accountNumber){
     this.accountNumber=accountNumber;
     this.balance = 0;
 }

 //Deposit method
 public void deposit(double amount){
     balance += amount;
 }

 //Withdraw method
 public void withdraw(double amount){
     if (amount <= balance)
         balance -= amount;
     else
         System.out.println("Insufficient balance");
 }

 // Check balance
 public double checkBalance() {
     return balance;
 }

 // Abstract method for interest calculation
 abstract double calculateInterest();
}
