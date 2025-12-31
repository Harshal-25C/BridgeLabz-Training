package com.inheritance.hierarchicalinheritance;

class FixedDepositAccount extends BankAccount{
    int tenureInYears;

    FixedDepositAccount(String accountNumber, double balance, int tenureInYears) {
        super(accountNumber, balance);
        this.tenureInYears = tenureInYears;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Tenure: " + tenureInYears + " years");
    }
}

