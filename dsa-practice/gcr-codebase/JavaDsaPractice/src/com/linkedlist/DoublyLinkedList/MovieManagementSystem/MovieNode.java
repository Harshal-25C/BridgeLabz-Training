package com.linkedlist.DoublyLinkedList.MovieManagementSystem;

class MovieNode{
 String title;
 String director;
 int year;
 double rating;
 MovieNode prev;   //Pointer to previous node
 MovieNode next;   //Pointer to next node

 //Constructor to initialize movie details
 MovieNode(String title, String director, int year, double rating) {
     this.title = title;
     this.director = director;
     this.year = year;
     this.rating = rating;
     this.prev = null;
     this.next = null;
 }
}
