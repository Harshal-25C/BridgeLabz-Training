package com.encapsulationandpolymorphism.BankingSystem;

class CurrentAccount extends BankAccount implements Loanable{

 CurrentAccount(int accNo, String name, double balance) {
     super(accNo, name, balance);
 }

 public double calculateInterest() {
     return balance * 0.02;
 }

 public void applyForLoan() {
     System.out.println("Current Account Loan Applied");
 }

 public double calculateLoanEligibility() {
     return balance * 3;
 }
}
