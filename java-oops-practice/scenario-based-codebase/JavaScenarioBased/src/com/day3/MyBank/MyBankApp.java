package com.day3.MyBank;

public class MyBankApp{
 public static void main(String[] args){

     Account acc1 = new SavingsAccount("SB1001", 10000);
     Account acc2 = new CurrentAccount("CA2001");

     acc1.deposit(2000);
     acc2.deposit(5000);

     System.out.println("Savings Balance: " + acc1.checkBalance());
     System.out.println("Savings Interest: " + acc1.calculateInterest());

     System.out.println("Current Balance: " + acc2.checkBalance());
     System.out.println("Current Interest: " + acc2.calculateInterest());
 }
}
