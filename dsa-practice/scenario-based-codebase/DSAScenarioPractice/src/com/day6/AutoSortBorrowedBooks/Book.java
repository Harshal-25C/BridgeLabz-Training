package com.day6.AutoSortBorrowedBooks;

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
