package com.encapsulationandpolymorphism.LibraryManagentSystem;

class Book extends LibraryItem implements Reservable{
 Book(int id, String title, String author){
     super(id, title, author);
 }

 public int getLoanDuration(){
     return 14;
 }

 public void reserveItem(String borrowerName){
     if (available)
         assignBorrower(borrowerName);
 }

 public boolean checkAvailability(){
     return available;
 }
}


