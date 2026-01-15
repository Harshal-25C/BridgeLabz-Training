package com.day10.UtilityBillPaymentSystem;

import java.time.LocalDate;

public class InternetBill extends Bill{
    public InternetBill(double amount, LocalDate dueDate) {
        super("Internet", amount, dueDate);
    }

    @Override
    public void pay(){
        if(!isPaid()){
            markAsPaid();
            System.out.println("Internet bill paid successfully.");
        }
    }

    @Override
    public void sendReminder(){
        System.out.println("Alert: Internet service will be interrupted if bill is unpaid.");
    }
}
