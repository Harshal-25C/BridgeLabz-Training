package com.objectmodeling;

//Bank class
class Bank {
 String bankName;

 Bank(String bankName) {
     this.bankName = bankName;
 }

 void openAccount(Customer customer) {
     System.out.println("Account opened for " + customer.customerName + " in " + bankName);
 }
}

