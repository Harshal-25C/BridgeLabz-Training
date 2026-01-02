package com.linkedlist.DoublyLinkedList.MovieManagementSystem;

//Doubly Linked List class for Movie Management
class MovieDoublyLinkedList {
 private MovieNode head; //First node
 private MovieNode tail; //Last node

 //Add movie at the beginning
 public void addAtBeginning(String title, String director, int year, double rating){
     MovieNode newNode = new MovieNode(title, director, year, rating);

     if(head == null){
         head = tail = newNode;
     }else{
         newNode.next = head;
         head.prev = newNode;
         head = newNode;
     }
 }

 //Add movie at the end
 public void addAtEnd(String title, String director, int year, double rating){
     MovieNode newNode = new MovieNode(title, director, year, rating);

     if (tail == null) {
         head = tail = newNode;
     } else {
         tail.next = newNode;
         newNode.prev = tail;
         tail = newNode;
     }
 }

 // Add movie at a specific position (1-based index)
 public void addAtPosition(int position, String title, String director, int year, double rating) {
     if (position <= 0) {
         System.out.println("Invalid position");
         return;
     }

     if (position == 1) {
         addAtBeginning(title, director, year, rating);
         return;
     }

     MovieNode temp = head;
     for (int i = 1; i < position - 1 && temp != null; i++) {
         temp = temp.next;
     }

     if (temp == null || temp.next == null) {
         addAtEnd(title, director, year, rating);
         return;
     }

     MovieNode newNode = new MovieNode(title, director, year, rating);
     newNode.next = temp.next;
     newNode.prev = temp;
     temp.next.prev = newNode;
     temp.next = newNode;
 }

 // Remove movie by Movie Title
 public void removeByTitle(String title) {
     MovieNode temp = head;

     while (temp != null) {
         if (temp.title.equalsIgnoreCase(title)) {

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

             System.out.println("Movie removed successfully");
             return;
         }
         temp = temp.next;
     }
     System.out.println("Movie not found");
 }

 // Update movie rating by title
 public void updateRating(String title, double newRating) {
     MovieNode temp = head;

     while (temp != null) {
         if (temp.title.equalsIgnoreCase(title)) {
             temp.rating = newRating;
             System.out.println("Rating updated successfully");
             return;
         }
         temp = temp.next;
     }
     System.out.println("Movie not found");
 }

 // Search movie by Director
 public void searchByDirector(String director) {
     MovieNode temp = head;
     boolean found = false;

     while (temp != null) {
         if (temp.director.equalsIgnoreCase(director)) {
             displayMovie(temp);
             found = true;
         }
         temp = temp.next;
     }

     if (!found)
         System.out.println("No movies found for given director");
 }

 // Search movie by Rating
 public void searchByRating(double rating) {
     MovieNode temp = head;
     boolean found = false;

     while (temp != null) {
         if (temp.rating >= rating) {
             displayMovie(temp);
             found = true;
         }
         temp = temp.next;
     }

     if (!found)
         System.out.println("No movies found with given rating");
 }

 // Display movies in forward order
 public void displayForward() {
     if (head == null) {
         System.out.println("Movie list is empty");
         return;
     }

     MovieNode temp = head;
     System.out.println("Movies (Forward Order):");
     while (temp != null) {
         displayMovie(temp);
         temp = temp.next;
     }
 }

 // Display movies in reverse order
 public void displayReverse() {
     if (tail == null) {
         System.out.println("Movie list is empty");
         return;
     }

     MovieNode temp = tail;
     System.out.println("Movies (Reverse Order):");
     while (temp != null) {
         displayMovie(temp);
         temp = temp.prev;
     }
 }

 // Display single movie details
 private void displayMovie(MovieNode m) {
     System.out.println(
             m.title + " | " +
             m.director + " | " +
             m.year + " | Rating: " + m.rating
     );
 }
}
