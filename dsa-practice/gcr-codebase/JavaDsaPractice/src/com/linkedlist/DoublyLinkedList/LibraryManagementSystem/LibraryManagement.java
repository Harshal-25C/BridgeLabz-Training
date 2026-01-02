package com.linkedlist.DoublyLinkedList.LibraryManagementSystem;

public class LibraryManagement{
 public static void main(String[] args){
     LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

     library.addAtEnd(101, "Java Programming", "James Gosling", "Education", true);
     library.addAtBeginning(102, "Clean Code", "Robert Martin", "Programming", true);
     library.addAtEnd(103, "Harry Potter", "J.K. Rowling", "Fantasy", false);
     library.addAtPosition(2, 104, "Data Structures", "Mark Allen", "CS", true);

     library.displayForward();
     library.displayReverse();

     library.searchByTitle("Clean Code");
     library.searchByAuthor("J.K. Rowling");

     library.updateAvailability(103, true);
     library.removeByBookId(104);

     library.countBooks();
     library.displayForward();
 }
}
