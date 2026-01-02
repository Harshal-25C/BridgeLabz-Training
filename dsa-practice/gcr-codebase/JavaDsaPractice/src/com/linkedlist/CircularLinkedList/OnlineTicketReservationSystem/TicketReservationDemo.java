package com.linkedlist.CircularLinkedList.OnlineTicketReservationSystem;

public class TicketReservationDemo{
 public static void main(String[] args){
     TicketReservationSystem system = new TicketReservationSystem();

     system.addTicket(101, "Harshal", "Inception", "A10", "10:30 AM");
     system.addTicket(102, "Amit", "Interstellar", "B12", "01:00 PM");
     system.addTicket(103, "Neha", "Inception", "C05", "06:45 PM");

     system.displayTickets();

     System.out.println("\nSearching for movie 'Inception':");
     system.searchTicket("Inception");

     system.removeTicket(102);

     system.displayTickets();

     System.out.println("\nTotal Booked Tickets: " + system.countTickets());
 }
}
