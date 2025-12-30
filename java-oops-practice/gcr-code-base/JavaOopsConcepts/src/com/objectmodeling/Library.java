package com.objectmodeling;
import java.util.*;

public class Library {

	String libraryName;
    ArrayList<Book> books = new ArrayList<>();

    Library(String libraryName) {
        this.libraryName = libraryName;
    }

    //Method to add book to library
    void addBook(Book book) {
        books.add(book);
    }

    void showBooks() {
        System.out.println("\nBooks in " + libraryName + ":");
        for (Book book : books) {
            book.displayBook();
        }
    }

}
