package com.constructorandaccessmodifiers.levelone;

public class BankAccount{
	//public variable
    public int accountNumber;

    //protected variable
    protected String accountHolder;

    //private variable
    private double balance;

    //constructor
    public BankAccount(int accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    //public method to access balance
    public double getBalance(){
        return balance;
    }

    //public method to modify balance
    public void setBalance(double balance){
        this.balance = balance;
    }

}
