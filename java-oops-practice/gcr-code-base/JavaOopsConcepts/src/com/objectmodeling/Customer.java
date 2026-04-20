package com.objectmodeling;

//Customer class
public class Customer {
 String customerName;
 double balance;

 Customer(String customerName, double balance) {
     this.customerName = customerName;
     this.balance = balance;
 }

 void viewBalance() {
     System.out.println(customerName + "'s Balance: ₹" + balance);
 }
}
