package com.objectmodeling;

public class AssociationExample{
    public static void main(String[] args) {

        Bank bank = new Bank("State Bank of India");
        Customer customer = new Customer("Ravi", 5000);

        bank.openAccount(customer);
        customer.viewBalance();
    }
}