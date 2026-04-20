package com.DesignPatterns.SmartUniversityLibraryManagementSystem;

import java.util.*;

class LibraryCatalog {

    private static LibraryCatalog instance;
    private List<Book> books = new ArrayList<>();

    private LibraryCatalog() {}

    public static synchronized LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public List<Book> getBooks() {
        return books;
    }
}
