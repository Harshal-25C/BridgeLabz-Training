package com.encapsulationandpolymorphism.BankingSystem;

class SavingsAccount extends BankAccount implements Loanable{

 SavingsAccount(int accNo, String name, double balance) {
     super(accNo, name, balance);
 }

 public double calculateInterest() {
     return balance * 0.04;
 }

 public void applyForLoan() {
     System.out.println("Savings Account Loan Applied");
 }

 public double calculateLoanEligibility() {
     return balance * 5;
 }
}

