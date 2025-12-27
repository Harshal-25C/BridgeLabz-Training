package com.constructorandaccessmodifiers.levelone;

public class LibraryBook{

	String title;
    String author;
    double price;
    boolean isAvailable;

    //Default constructor
    LibraryBook() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.isAvailable = true;
    }

    //Parameterized constructor
    LibraryBook(String title, String author, double price, boolean isAvailable){
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    //Method to borrow a book
    void borrowBook(){
        if (isAvailable) {
            System.out.println(title + " has been borrowed successfully.");
            isAvailable = false;
        } else {
            System.out.println(title + " is currently unavailable.");
        }
    }

    void displayBook(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    public static void main(String[] args){
        LibraryBook book1 = new LibraryBook("Java Programming", "Harshal", 499.99, true);
        book1.displayBook();

        System.out.println();

        book1.borrowBook();
        book1.displayBook();
    }
}
