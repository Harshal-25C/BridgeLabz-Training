package com.day1;

//SavingsAccount inherits Account and implements Transaction
class SavingsAccount3 extends Account3 implements Transaction{
 private double interestRate;

 //Constructor using super keyword
 SavingsAccount3(int accNo, double balance, double interestRate){
     super(accNo, balance);
     this.interestRate = interestRate;
 }

 //Polymorphic implementation of interest calculation
 public void calculateInterest(){
     balance += balance * interestRate / 100;
 }
}
