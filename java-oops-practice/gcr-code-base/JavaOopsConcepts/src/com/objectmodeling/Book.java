package com.objectmodeling;
import java.util.*;

public class Book {

	String title;
    String author;

    //Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBook(){
        System.out.println("Book: " + title + ", Author: " + author);
    }

}
