package com.linkedlist.DoublyLinkedList.LibraryManagementSystem;


//Doubly Linked List class for Library Management
class LibraryDoublyLinkedList{
 private BookNode head; //First book
 private BookNode tail; //Last book

 //Add book at the beginning
 public void addAtBeginning(int id, String title, String author, String genre, boolean status) {
     BookNode newNode = new BookNode(id, title, author, genre, status);

     if (head == null) {
         head = tail = newNode;
     } else {
         newNode.next = head;
         head.prev = newNode;
         head = newNode;
     }
 }

 //Add book at the end
 public void addAtEnd(int id, String title, String author, String genre, boolean status) {
     BookNode newNode = new BookNode(id, title, author, genre, status);

     if (tail == null) {
         head = tail = newNode;
     } else {
         tail.next = newNode;
         newNode.prev = tail;
         tail = newNode;
     }
 }

 // Add book at a specific position (1-based index)
 public void addAtPosition(int position, int id, String title, String author,
                           String genre, boolean status) {

     if (position <= 0) {
         System.out.println("Invalid position");
         return;
     }

     if (position == 1) {
         addAtBeginning(id, title, author, genre, status);
         return;
     }

     BookNode temp = head;
     for (int i = 1; i < position - 1 && temp != null; i++) {
         temp = temp.next;
     }

     if (temp == null || temp.next == null) {
         addAtEnd(id, title, author, genre, status);
         return;
     }

     BookNode newNode = new BookNode(id, title, author, genre, status);
     newNode.next = temp.next;
     newNode.prev = temp;
     temp.next.prev = newNode;
     temp.next = newNode;
 }

 //Remove book by Book ID
 public void removeByBookId(int bookId) {
     BookNode temp = head;

     while (temp != null) {
         if (temp.bookId == bookId) {

             if (temp == head) {
                 head = head.next;
                 if (head != null)
                     head.prev = null;
             } else if (temp == tail) {
                 tail = tail.prev;
                 tail.next = null;
             } else {
                 temp.prev.next = temp.next;
                 temp.next.prev = temp.prev;
             }

             System.out.println("Book removed successfully");
             return;
         }
         temp = temp.next;
     }
     System.out.println("Book not found");
 }

 //Update availability status by Book ID
 public void updateAvailability(int bookId, boolean newStatus) {
     BookNode temp = head;

     while (temp != null) {
         if (temp.bookId == bookId) {
             temp.isAvailable = newStatus;
             System.out.println("Availability status updated");
             return;
         }
         temp = temp.next;
     }
     System.out.println("Book not found");
 }

 // Search book by Title
 public void searchByTitle(String title) {
     BookNode temp = head;
     boolean found = false;

     while (temp != null) {
         if (temp.title.equalsIgnoreCase(title)) {
             displayBook(temp);
             found = true;
         }
         temp = temp.next;
     }

     if (!found)
         System.out.println("Book not found");
 }

 // Search book by Author
 public void searchByAuthor(String author) {
     BookNode temp = head;
     boolean found = false;

     while (temp != null) {
         if (temp.author.equalsIgnoreCase(author)) {
             displayBook(temp);
             found = true;
         }
         temp = temp.next;
     }

     if (!found)
         System.out.println("No books found for this author");
 }

 //Display all books in forward order
 public void displayForward() {
     if (head == null) {
         System.out.println("Library is empty");
         return;
     }

     BookNode temp = head;
     System.out.println("Library Books (Forward):");
     while (temp != null) {
         displayBook(temp);
         temp = temp.next;
     }
 }

 // Display all books in reverse order
 public void displayReverse() {
     if (tail == null) {
         System.out.println("Library is empty");
         return;
     }

     BookNode temp = tail;
     System.out.println("Library Books (Reverse):");
     while (temp != null) {
         displayBook(temp);
         temp = temp.prev;
     }
 }

 //Count total number of books
 public void countBooks() {
     int count = 0;
     BookNode temp = head;

     while (temp != null) {
         count++;
         temp = temp.next;
     }

     System.out.println("Total number of books: " + count);
 }

 //Display single book details
 private void displayBook(BookNode b) {
     System.out.println(
             b.bookId + " | " +
             b.title + " | " +
             b.author + " | " +
             b.genre + " | " +
             (b.isAvailable ? "Available" : "Not Available")
     );
 }
}

