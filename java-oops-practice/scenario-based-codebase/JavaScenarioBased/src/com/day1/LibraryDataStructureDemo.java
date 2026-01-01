package com.day1;

public class LibraryDataStructureDemo{
    public static void main(String[] args){
        //Creating library object
        Library library = new Library();

        //Adding books dynamically
        library.addBook(new Book("Effective Java", "Joshua Bloch", 2018));
        library.addBook(new Book("Java Complete Reference", "Herbert Schildt", 2021));
        library.addBook(new Book("Clean Code", "Robert Martin", 2009));
        library.addBook(new Book("Clean Architecture", "Robert Martin", 2017));

        //Displaying all books
        library.displayBooks();

        //Displaying books filtered by author
        System.out.println("Books by Robert Martin:");
        library.displayBooksByAuthor("Robert Martin");
    }
}