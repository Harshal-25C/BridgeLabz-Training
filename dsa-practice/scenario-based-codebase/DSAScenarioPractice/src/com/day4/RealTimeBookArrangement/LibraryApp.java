package com.day4.RealTimeBookArrangement;

import java.util.*;

public class LibraryApp {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Algorithms"));
        books.add(new Book("Data Structures"));
        books.add(new Book("Java Programming"));

        SmartShelf.insertionSort(books);

        for(Book b:books) {
            System.out.println(b);
        }
    }
}
