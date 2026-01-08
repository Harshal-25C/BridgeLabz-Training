package com.day7.MediStore;
import java.time.LocalDate;

class Syrup extends Medicine {

    public Syrup(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public boolean checkExpiry() {
        // Liquids expire earlier (buffer of 7 days)
        return LocalDate.now().isAfter(expiryDate.minusDays(7));
    }
}
