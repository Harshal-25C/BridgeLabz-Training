package com.day7.MediStore;

import java.time.LocalDate;

abstract class Medicine implements ISellable {

    protected String name;
    protected double price;
    protected LocalDate expiryDate;

    private int quantity;     
    private static final double DISCOUNT_RATE = 0.05; //5% discount

    //Constructor with default quantity
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 100);
    }

    //Constructor with custom quantity
    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    //Encapsulated stock adjustment
    protected void reduceStock(int soldQty) {
        if(soldQty<=quantity){
            quantity -= soldQty;
        }else{
            System.out.println("Insufficient stock for " + name);
        }
    }

    protected int getQuantity() {
        return quantity;
    }

    //Private pricing logic
    private double applyDiscount(double total) {
        return total-(total*DISCOUNT_RATE);
    }

    @Override
    public void sell(int qty) {
        if(checkExpiry()){
            System.out.println(name + " is expired. Cannot sell.");
            return;
        }

        if(qty > quantity){
            System.out.println("Not enough stock for " + name);
            return;
        }

        double totalPrice = price*qty;
        totalPrice = applyDiscount(totalPrice);

        reduceStock(qty);
        System.out.println("Sold " + qty + " units of " + name +
                " | Total Price: ₹" + totalPrice +
                " | Remaining Stock: " + quantity);
    }
}
