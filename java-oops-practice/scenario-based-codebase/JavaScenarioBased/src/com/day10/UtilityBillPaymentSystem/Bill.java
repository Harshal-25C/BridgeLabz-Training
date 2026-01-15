package com.day10.UtilityBillPaymentSystem;

import java.time.LocalDate;

public abstract class Bill implements IPayable {

    private String type;
    protected double amount;
    protected LocalDate dueDate;
    private boolean isPaid;

    //Constructor for recurring bills
    public Bill(String type, double amount, LocalDate dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    //Operator usage: baseAmount + penalty
    public double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    //Encapsulation: no direct status change
    protected void markAsPaid() {
        this.isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public String getType() {
        return type;
    }
}
