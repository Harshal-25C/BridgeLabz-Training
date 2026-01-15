package com.day4.DailySalesSummaryReport;
import java.time.LocalDate;

public class SalesRecord {

    private String transactionId;
    private LocalDate date;
    private double amount;

    public SalesRecord(String transactionId, LocalDate date, double amount) {
        this.transactionId=transactionId;
        this.date=date;
        this.amount=amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String toString() {
        return transactionId+" | "+date+" | ₹"+ amount;
    }
}
