package com.day1.LibraryOrganizer;

public class BookShelf {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LibraryCatalog lib = new LibraryCatalog(0, null, null, null);
		
		Book b1 = new Book(1, "WORA", "James Gosling", "Programming");
		Book b2 = new Book(2, "Harry Potter", "J.k rowing", "Fiction");
		Book b3 = new Book(3, "Chemistry", "Ayush Mishra", "Science");
		Book b4 = new Book(4, "Maths", "Devarshi M", "Science");
		
		lib.addBook(b1);
		lib.addBook(b2);
		lib.addBook(b3);
		lib.addBook(b4);
		
		lib.displayCatalog();

        lib.borrowBook(2);
        lib.borrowBook(2);

        lib.returnBook(2);

        lib.removeBook(1);

        lib.displayCatalog();
	}

}
