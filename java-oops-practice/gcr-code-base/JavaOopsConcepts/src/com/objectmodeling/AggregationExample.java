package com.objectmodeling;

public class AggregationExample{

	public static void main(String[] args){

        //Books created independently
        Book book1 = new Book("Java Basics", "James Gosling");
        Book book2 = new Book("Python Guide", "Guido van Rossum");

        //Libraries
        Library library1 = new Library("City Library");
        Library library2 = new Library("College Library");

        //Same books added to different libraries
        library1.addBook(book1);
        library2.addBook(book1);
        library2.addBook(book2);

        library1.showBooks();
        library2.showBooks();
    }

}
