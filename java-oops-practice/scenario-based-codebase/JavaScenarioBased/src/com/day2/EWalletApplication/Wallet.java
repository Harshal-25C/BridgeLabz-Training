package com.day2.EWalletApplication;
import java.util.*;

abstract class Wallet implements Transferrable {
 private double balance; // encapsulated balance
 protected List<Transaction> transactions = new ArrayList<>();

 //Constructor with optional referral bonus
 Wallet(double initialAmount, boolean referralBonus) {
     balance = initialAmount + (referralBonus ? 50 : 0); // operator usage
 }

 //Public getter for balance
 public double getBalance() {
     return balance;
 }

 protected void credit(double amount) {
     balance += amount;
 }

 protected boolean debit(double amount){
     if(amount <= balance){
         balance -= amount;
         return true;
     }
     return false;
 }
}
