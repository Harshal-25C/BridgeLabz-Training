package com.constructorandaccessmodifiers.levelone;

public class TestLibrary{

	public static void main(String[] args){
        EBook ebook = new EBook("978-12345", "Java Basics", "Harshal", 5.2);

        ebook.displayDetails();

        //Updating author using setter
        ebook.setAuthor("John Doe");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }

}
