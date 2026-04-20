package com.encapsulationandpolymorphism.LibraryManagentSystem;
import java.util.*;

public class LibraryManagement{
 public static void main(String[] args){

     List<LibraryItem> items = new ArrayList<>();

     items.add(new Book(1, "Effective Java", "Joshua Bloch"));
     items.add(new Magazine(2, "Time", "Editorial"));
     items.add(new DVD(3, "Inception", "Christopher Nolan"));

     for(LibraryItem item : items){
         item.getItemDetails();
         System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

         Reservable r = (Reservable) item;
         r.reserveItem("User1");
         System.out.println("Available After Reservation: " + r.checkAvailability());
         System.out.println("---------------------------");
     }
 }
}

