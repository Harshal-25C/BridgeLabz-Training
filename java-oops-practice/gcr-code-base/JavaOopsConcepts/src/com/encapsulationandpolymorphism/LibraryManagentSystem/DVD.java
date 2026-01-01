package com.encapsulationandpolymorphism.LibraryManagentSystem;

class DVD extends LibraryItem implements Reservable{
 DVD(int id, String title, String author){
     super(id, title, author);
 }

 public int getLoanDuration() {
     return 5;
 }

 public void reserveItem(String borrowerName) {
     if (available)
         assignBorrower(borrowerName);
 }

 public boolean checkAvailability() {
     return available;
 }
}

