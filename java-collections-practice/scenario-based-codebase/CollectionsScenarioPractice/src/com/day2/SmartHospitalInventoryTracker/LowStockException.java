package com.day2.SmartHospitalInventoryTracker;

public class LowStockException extends Exception {
    public LowStockException(String message) {
        super(message);
    }
}
