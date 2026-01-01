package com.encapsulationandpolymorphism.LibraryManagentSystem;

abstract class LibraryItem {
 private int itemId;
 private String title;
 private String author;
 private String borrower; // Encapsulated personal data
 protected boolean available = true;

 // Constructor
 LibraryItem(int itemId, String title, String author) {
     this.itemId = itemId;
     this.title = title;
     this.author = author;
 }

 // Abstract method for loan duration
 abstract int getLoanDuration();

 // Concrete method to display item details
 public void getItemDetails() {
     System.out.println("ID: " + itemId);
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("Available: " + available);
 }

 // Encapsulated borrower assignment
 protected void assignBorrower(String name) {
     borrower = name;
     available = false;
 }
}

