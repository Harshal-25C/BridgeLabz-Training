package com.encapsulationandpolymorphism.BankingSystem;

abstract class BankAccount{
 private int accountNumber;
 private String holderName;
 protected double balance;

 //Constructor
 BankAccount(int accountNumber, String holderName, double balance) {
     this.accountNumber = accountNumber;
     this.holderName = holderName;
     this.balance = balance;
 }

 //Encapsulated deposit method
 public void deposit(double amount){
     balance += amount;
 }

 public void withdraw(double amount){
     if (amount <= balance)
         balance -= amount;
     else
         System.out.println("Insufficient balance");
 }

 // Abstract method for interest calculation
 abstract double calculateInterest();

 public void displayAccount() {
     System.out.println("Account No: " + accountNumber);
     System.out.println("Holder: " + holderName);
     System.out.println("Balance: ₹" + balance);
     System.out.println("Interest: ₹" + calculateInterest());
     System.out.println("-------------------------");
 }
}

