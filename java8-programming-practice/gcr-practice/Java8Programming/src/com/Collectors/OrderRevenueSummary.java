package com.Collectors;

import java.util.*;
import java.util.stream.Collectors;

class Order {
    private String customerName;
    private double totalAmount;

    public Order(String customerName, double totalAmount) {
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}

public class OrderRevenueSummary {

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("Harshal", 2500),
                new Order("Amit", 1500),
                new Order("Harshal", 1800),
                new Order("Neha", 3000)
        );

        Map<String, Double> revenueByCustomer = orders.stream()
                      .collect(Collectors.groupingBy(
                              Order::getCustomerName,
                              Collectors.summingDouble(Order::getTotalAmount)
                      ));

        revenueByCustomer.forEach((customer, total) -> System.out.println(customer + " → " + total));
    }
}
