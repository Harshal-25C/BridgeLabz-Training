package com.day6.AutoSortBorrowedBooks;

public class SmartLibrary {
    public static void insertionSort(Book[] books) {

        for(int i=1; i<books.length; i++) {

            Book key = books[i];
            int j = i-1;

            while(j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {

                books[j+1] = books[j];
                j--;
            }

            books[j+1] = key;
        }
    }

    public static void main(String[] args) {

        Book[] borrowedBooks = {
            new Book("Algorithms"),
            new Book("Data Structures"),
            new Book("Java Programming"),
            new Book("Computer Networks")
        };

        insertionSort(borrowedBooks);

        System.out.println("Borrowed books (Alphabetically Sorted):");
        for(Book b:borrowedBooks) {
            System.out.println(b);
        }
    }
}
