package com.encapsulationandpolymorphism.BankingSystem;

import java.util.*;

public class BankingSystem{
 public static void main(String[] args){

     List<BankAccount> accounts = new ArrayList<>();

     accounts.add(new SavingsAccount(101, "Rahul", 50000));
     accounts.add(new CurrentAccount(102, "Anita", 80000));

     for(BankAccount acc : accounts){
         acc.displayAccount();

         Loanable loan = (Loanable) acc;
         loan.applyForLoan();
         System.out.println("Loan Eligibility: ₹" + loan.calculateLoanEligibility());
         System.out.println();
     }
 }
}
