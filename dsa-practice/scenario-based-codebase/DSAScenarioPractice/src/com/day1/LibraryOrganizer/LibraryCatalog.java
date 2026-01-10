package com.day1.LibraryOrganizer;
import java.util.*;

class LibraryCatalog extends Book{
    

	public LibraryCatalog(int bookId, String title, String author, String genre) {
		super(bookId, title, author, genre);
		// TODO Auto-generated constructor stub
	}

	private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();
	
	//Initialize a method addBook
	public void addBook(Book book) {
		String genre = book.getGenre();
		
		if(!catalog.containsKey(genre)) {
			catalog.put(genre, new LinkedList<>());
		}
		catalog.get(genre).add(book);
	}
	
	//Initialize a method removeBook
	public void removeBook(int bookId) {
		for(LinkedList<Book> bookList : catalog.values()) {
			
			Iterator<Book> it = bookList.iterator();
			while(it.hasNext()) {
	            Book book = it.next();

	            if(book.getBookId() == bookId) {
	                it.remove();
	            }
	        }
			
//			for(Book b : bookList)
//			if (b.getBookId() == bookId) {
//		        bookList.remove(b);
//		    }
		}
	}
	
	//Initialize a method borrowBook
	public void borrowBook(int bookId) {
		for(LinkedList<Book> bookList : catalog.values()) {
			for(Book b : bookList) {
				
				if(b.getBookId() == bookId) {
					
				    if (b.isAvailable()) {
                        b.setAvailable(false);
                        System.out.println("Book borrowed successfully");
                    } else {
                        System.out.println("Already borrowed");
                    }
                    return;
                }
            }
            System.out.println("Book not found");
	    }
    }
	
	//Initialize a method returnBook
	public void returnBook(int bookId) {
        for (LinkedList<Book> bookList : catalog.values()) {
            for (Book b : bookList) {
                if (b.getBookId() == bookId) {
                    b.setAvailable(true);
                    System.out.println("Book returned successfully");
                    return;
                }
            }
        }
        System.out.println("Book not found");
    }
    
	//Initialize a method displayCatalog
    public void displayCatalog() {
    	
        for (String genre : catalog.keySet()) {
            System.out.println("Genre: " + genre);
            
            for (Book b : catalog.get(genre)) {
                System.out.println("  " + b);
            }
        }
    }
}
