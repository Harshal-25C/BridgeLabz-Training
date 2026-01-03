package com.day3.MyBank;

//Savings Account
class SavingsAccount extends Account{
 private double interestRate = 4.0;

 SavingsAccount(String accNo, double balance){
     super(accNo, balance);
 }

 //Polymorphic interest calculation
 double calculateInterest() {
     return checkBalance() * interestRate/100;
 }
}
