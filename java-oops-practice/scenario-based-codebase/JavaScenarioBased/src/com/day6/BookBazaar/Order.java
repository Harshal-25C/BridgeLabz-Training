package com.day6.BookBazaar;

import java.util.*;

public class Order{
    private String orderId;
    private String userName;

    private String orderStatus; //restricted
    private Map<Book, Integer> items = new HashMap<>();

    public Order(String orderId, String userName) {
        this.orderId = orderId;
        this.userName = userName;
        this.orderStatus = "CREATED";
    }

    public void addBook(Book book, int quantity){
        if(book.reduceStock(quantity)){
            items.put(book, quantity);
        }else{
            System.out.println("Insufficient stock for: "+book.title);
        }
    }

    public double calculateTotal(){
        double total = 0;

        for (Map.Entry<Book, Integer> entry : items.entrySet()) {
            Book book = entry.getKey();
            int qty = entry.getValue();

            double cost = book.getPrice() * qty;
            double discount = book.applyDiscount(qty);

            total += (cost - discount);//operator usage
        }
        return total;
    }

    //Restricted status update
    protected void updateOrderStatus(String status) {
        this.orderStatus = status;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
}
