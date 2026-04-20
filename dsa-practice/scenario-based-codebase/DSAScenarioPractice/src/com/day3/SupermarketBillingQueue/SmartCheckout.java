package com.day3.SupermarketBillingQueue;

import java.util.*;

public class SmartCheckout {

    private Queue<Customer> customerQueue;
    private Map<String, Double> priceMap;
    private Map<String, Integer> stockMap;

    public SmartCheckout() {
        customerQueue = new LinkedList<>();
        priceMap = new HashMap<>();
        stockMap = new HashMap<>();
    }

    //Add item to store
    public void addItem(String item, double price, int stock) {
        priceMap.put(item, price);
        stockMap.put(item, stock);
    }

    //Add customer
    public void addCustomer(Customer customer) {
        customerQueue.offer(customer);
        System.out.println(customer.name+" added to checkout queue");
    }

    //Process billing
    public void processNextCustomer() {
        if(customerQueue.isEmpty()){
            System.out.println("No customers in queue");
            return;
        }

        Customer customer = customerQueue.poll();
        double total = 0;

        for(String item : customer.items) {
            if(stockMap.getOrDefault(item, 0) > 0) {
                total+=priceMap.get(item);
                stockMap.put(item, stockMap.get(item) - 1);
            }else {
                System.out.println(item+" is out of stock");
            }
        }

        System.out.println("Bill for "+customer.name+": ₹"+total);
    }
}
