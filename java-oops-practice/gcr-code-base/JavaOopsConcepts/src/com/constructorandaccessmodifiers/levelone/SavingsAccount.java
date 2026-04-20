package com.constructorandaccessmodifiers.levelone;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(int accountNumber, String accountHolder, double balance){
        super(accountNumber, accountHolder, balance);
    }

    public void displayDetails(){
        System.out.println("Account Number: " + accountNumber); // public
        System.out.println("Account Holder: " + accountHolder); // protected
        System.out.println("Balance: " + getBalance());         // private via method
    }

    public static void main(String[] args){
        SavingsAccount sa = new SavingsAccount(101, "Harshh", 25000);
        sa.displayDetails();
        sa.setBalance(30000);
        System.out.println("Updated Balance: " + sa.getBalance());
    }
}
