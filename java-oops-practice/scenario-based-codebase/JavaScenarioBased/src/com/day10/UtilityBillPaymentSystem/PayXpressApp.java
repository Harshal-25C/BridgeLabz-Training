package com.day10.UtilityBillPaymentSystem;

import java.time.LocalDate;

public class PayXpressApp{
    public static void main(String[] args){

        Bill bill1 = new ElectricityBill(1200, LocalDate.now().plusDays(5));
        Bill bill2 = new InternetBill(999, LocalDate.now().plusDays(3));
        Bill bill3 = new WaterBill(450, LocalDate.now().plusDays(7));

        bill1.sendReminder();
        bill2.sendReminder();
        bill3.sendReminder();

        bill1.pay();
        bill2.pay();

        System.out.println("Late fee (Electricity): "+bill1.calculateLateFee(100));
    }
}
