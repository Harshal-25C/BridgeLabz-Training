package com.constructorandaccessmodifiers.levelone;

public class Book{

	String title;
    String author;
    double price;

    //Default constructor
    Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    //Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        //Using default constructor
        Book book1 = new Book();
        book1.display();

        System.out.println();

        //Using parameterized constructor
        Book book2 = new Book("Java Programming", "John doe", 499.99);
        book2.display();
    }
}
