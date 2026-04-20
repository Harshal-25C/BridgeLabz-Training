package com.encapsulationandpolymorphism.LibraryManagentSystem;

class Magazine extends LibraryItem implements Reservable{

 Magazine(int id, String title, String author){
     super(id, title, author);
 }

 public int getLoanDuration(){
     return 7;
 }

 public void reserveItem(String borrowerName){
     if (available)
         assignBorrower(borrowerName);
 }

 public boolean checkAvailability(){
     return available;
 }
}

