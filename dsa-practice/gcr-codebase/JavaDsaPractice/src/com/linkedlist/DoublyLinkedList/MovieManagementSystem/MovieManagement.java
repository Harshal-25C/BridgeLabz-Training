package com.linkedlist.DoublyLinkedList.MovieManagementSystem;

public class MovieManagement{
 public static void main(String[] args){

     MovieDoublyLinkedList movies = new MovieDoublyLinkedList();

     movies.addAtEnd("Inception", "Christopher Nolan", 2010, 9.0);
     movies.addAtBeginning("Interstellar", "Christopher Nolan", 2014, 8.8);
     movies.addAtEnd("Avatar", "James Cameron", 2009, 7.8);
     movies.addAtPosition(2, "Titanic", "James Cameron", 1997, 8.2);

     movies.displayForward();
     movies.displayReverse();

     movies.searchByDirector("Christopher Nolan");
     movies.searchByRating(8.0);

     movies.updateRating("Avatar", 8.1);
     movies.removeByTitle("Titanic");

     movies.displayForward();
 }
}
