package com.day10.UtilityBillPaymentSystem;
import java.time.LocalDate;

public class WaterBill extends Bill {

    public WaterBill(double amount, LocalDate dueDate){
        super("Water", amount, dueDate);
    }

    @Override
    public void pay() {
        if(!isPaid()) {
            markAsPaid();
            System.out.println("Water bill paid successfully.");
        }
    }

    @Override
    public void sendReminder() {
        System.out.println("Notice: Please clear your Water bill to avoid late charges.");
    }
}
