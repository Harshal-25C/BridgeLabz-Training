package com.linkedlist.CircularLinkedList.OnlineTicketReservationSystem;

//Node class representing a Ticket
class Ticket{
 int ticketId;
 String customerName;
 String movieName;
 String seatNumber;
 String bookingTime;
 Ticket next;

 //Constructor to initialize ticket details
 Ticket(int ticketId, String customerName, String movieName,
        String seatNumber, String bookingTime){
     this.ticketId = ticketId;
     this.customerName = customerName;
     this.movieName = movieName;
     this.seatNumber = seatNumber;
     this.bookingTime = bookingTime;
     this.next = null;
 }
}
