package com.linkedlist.DoublyLinkedList.LibraryManagementSystem;

//Node class representing a Book in the library
class BookNode{
 int bookId;
 String title;
 String author;
 String genre;
 boolean isAvailable;
 BookNode prev;//Pointer to previous node
 BookNode next; //Pointer to next node

 //Constructor to initialize book details
 BookNode(int bookId, String title, String author, String genre, boolean isAvailable){
     this.bookId = bookId;
     this.title = title;
     this.author = author;
     this.genre = genre;
     this.isAvailable = isAvailable;
     this.prev = null;
     this.next = null;
 }
}
