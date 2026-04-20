package com.day6.BookBazaar;

public class BookBazaarApp {
    public static void main(String[] args) {

        Book ebook = new EBook("Java Mastery", "James", 500, 10);
        Book printed = new PrintedBook("DSA Handbook", "Robert", 800, 5);

        Order order = new Order("ORD101", "Harshal");

        order.addBook(ebook, 2);
        order.addBook(printed, 3);

        System.out.println("Total Amount: ₹" + order.calculateTotal());
        System.out.println("Order Status: " + order.getOrderStatus());
    }
}
