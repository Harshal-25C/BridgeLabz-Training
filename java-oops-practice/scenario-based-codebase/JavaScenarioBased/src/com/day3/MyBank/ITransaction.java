package com.day3.MyBank;

//Interface for transactions
interface ITransaction{
 void deposit(double amount);
 void withdraw(double amount);
 double checkBalance();
}
