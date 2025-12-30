package com.objectmodeling;

public class Customer1 {

	String customerName;

    Customer1(String customerName) {
        this.customerName = customerName;
    }

    void placeOrder(Order order) {
        System.out.println(customerName + " placed an order.");
        order.showOrderDetails();
    }

}
