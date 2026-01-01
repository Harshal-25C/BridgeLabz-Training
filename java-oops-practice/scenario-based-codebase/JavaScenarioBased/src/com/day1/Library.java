package com.day1;
import java.util.*;

class Library{
    //Dynamic list to store all books
    ArrayList<Book> bookList = new ArrayList<>();

    // Map to store books grouped by author
    HashMap<String, ArrayList<Book>> booksByAuthor = new HashMap<>();

    // Method to add a book to library
    void addBook(Book book) {
        bookList.add(book);

        // Grouping books using HashMap
        booksByAuthor
            .computeIfAbsent(book.author, k -> new ArrayList<>())
            .add(book);
    }

    // Method to display all books
    void displayBooks() {
        StringBuilder sb = new StringBuilder();

        for (Book b : bookList) {
            sb.append(b.title)
              .append(" (")
              .append(b.year)
              .append(") - ")
              .append(b.author)
              .append("\n");
        }

        System.out.println(sb.toString());
    }

    // Method to display books by a specific author
    void displayBooksByAuthor(String author) {
        if (booksByAuthor.containsKey(author)) {
            for (Book b : booksByAuthor.get(author)) {
                System.out.println(b.title);
            }
        } else {
            System.out.println("No books found for author: " + author);
        }
    }
}
