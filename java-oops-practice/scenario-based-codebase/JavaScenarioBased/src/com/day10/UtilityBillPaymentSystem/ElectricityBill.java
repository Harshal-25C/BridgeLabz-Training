package com.day10.UtilityBillPaymentSystem;

import java.time.LocalDate;

public class ElectricityBill extends Bill {

    public ElectricityBill(double amount, LocalDate dueDate) {
        super("Electricity", amount, dueDate);
    }

    @Override
    public void pay() {
        if(!isPaid()) {
            markAsPaid();
            System.out.println("Electricity bill paid successfully.");
        }
    }

    @Override
    public void sendReminder() {
        System.out.println("Reminder: Please pay your Electricity bill before due date.");
    }
}
