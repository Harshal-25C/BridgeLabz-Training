package com.day7.MediStore;
import java.time.LocalDate;

class Injection extends Medicine{

    public Injection(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate, 50);
    }

    @Override
    public boolean checkExpiry(){
        return LocalDate.now().isAfter(expiryDate);
    }
}
