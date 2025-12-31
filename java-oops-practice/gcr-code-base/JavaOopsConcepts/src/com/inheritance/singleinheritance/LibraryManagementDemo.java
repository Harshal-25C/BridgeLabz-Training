package com.inheritance.singleinheritance;

public class LibraryManagementDemo {
    public static void main(String[] args) {

        Author book = new Author(
                "Effective Java",
                2018,
                "Joshua Bloch",
                "Java expert and author"
        );

        book.displayInfo();
    }
}

