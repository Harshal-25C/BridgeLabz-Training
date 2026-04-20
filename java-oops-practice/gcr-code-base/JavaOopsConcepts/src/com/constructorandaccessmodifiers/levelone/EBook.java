package com.constructorandaccessmodifiers.levelone;

public class EBook extends BookLibSystem{

    double fileSize; // in MB

    //Constructor
    EBook(String ISBN, String title, String author, double fileSize){
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    //Method to display details
    void displayDetails() {
    	//public access
        System.out.println("ISBN: " + ISBN); 
        //protected access
        System.out.println("Title: " + title); 
        //private via getter
        System.out.println("Author: " + getAuthor());
        System.out.println("File Size: " + fileSize + " MB");
    }
}

