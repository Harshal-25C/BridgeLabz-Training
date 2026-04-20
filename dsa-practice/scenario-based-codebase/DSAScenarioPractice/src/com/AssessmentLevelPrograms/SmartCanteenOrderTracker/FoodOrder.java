package com.AssessmentLevelPrograms.SmartCanteenOrderTracker;

public class FoodOrder {

    private String employeeName;
    private String foodItem;
    private int quantity;
    private double pricePerItem;
    private double totalAmount;

    public FoodOrder(String employeeName, String foodItem, int quantity, double pricePerItem) {
        this.employeeName = employeeName;
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
        calculateTotal();
    }

    private void calculateTotal() {
        double subtotal = quantity * pricePerItem;
        double gst = subtotal * 0.05; //5% GST
        this.totalAmount = subtotal + gst;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Employee: " + employeeName +
                ", Item: " + foodItem +
                ", Qty: " + quantity +
                ", Price: ₹" + pricePerItem +
                ", Total (incl. GST): ₹" + totalAmount;
    }
}

/* Question 1: Smart Canteen Order Tracker 
Scenario
A corporate office has a smart canteen where employees place food orders during lunch hours.
Each order contains the employee name, food item, quantity, and price per item.

Problem Statement -
Develop a Java application to manage food orders.

• Create a class with appropriate fields and methods.
• Use a Collection (List) to store multiple food orders.
• Accept input using Scanner.
• Use a switch-case to validate food items:
• Burger – ₹80
• Pizza – ₹120
• Sandwich – ₹60

Calculate:
• Total bill per order
• Add 5% GST using arithmetic operators
• Use a while loop to continue taking orders.
• Use continue to skip invalid food items.
• Handle invalid quantity input using Exception Handling.
• Display a final summary of all orders.
 */
