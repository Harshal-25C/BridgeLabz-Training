package com.linkedlist.CircularLinkedList.OnlineTicketReservationSystem;

//Circular Linked List for Ticket Reservation
class TicketReservationSystem{

 private Ticket head = null;
 private Ticket tail = null;

 //Add a new ticket at the end of the circular list
 public void addTicket(int id, String customer, String movie,
                       String seat, String time){

     Ticket newTicket = new Ticket(id, customer, movie, seat, time);

     if(head == null){
         head = tail=newTicket;
         newTicket.next = head; //Circular link
     }else{
         tail.next = newTicket;
         newTicket.next = head;
         tail = newTicket;
     }
 }

 //Remove a ticket by Ticket ID
 public void removeTicket(int ticketId){
     if(head == null){
         System.out.println("No tickets to remove.");
         return;
     }

     Ticket current = head;
     Ticket previous = tail;

     do {
         if (current.ticketId == ticketId) {

             if (current == head && current == tail) {
                 head = tail = null;
             } else {
                 previous.next = current.next;
                 if (current == head) {
                     head = current.next;
                     tail.next = head;
                 }
                 if (current == tail) {
                     tail = previous;
                 }
             }

             System.out.println("Ticket ID " + ticketId + " removed successfully.");
             return;
         }

         previous = current;
         current = current.next;

     } while (current != head);

     System.out.println("Ticket not found.");
 }

 //Display all tickets
 public void displayTickets(){
     if(head == null){
         System.out.println("No tickets booked.");
         return;
     }

     Ticket temp = head;
     System.out.println("\n--- Booked Tickets ---");

     do{
         System.out.println(
             "Ticket ID: " + temp.ticketId +
             ", Customer: " + temp.customerName +
             ", Movie: " + temp.movieName +
             ", Seat: " + temp.seatNumber +
             ", Time: " + temp.bookingTime
         );
         temp = temp.next;
     }while(temp != head);
 }

 //Search ticket by Customer Name or Movie Name
 public void searchTicket(String keyword){
     if(head == null){
         System.out.println("No tickets available.");
         return;
     }

     boolean found = false;
     Ticket temp = head;

     do{
         if(temp.customerName.equalsIgnoreCase(keyword)||
             temp.movieName.equalsIgnoreCase(keyword)){

             System.out.println(
                 "Found Ticket -> ID: " + temp.ticketId +
                 ", Customer: " + temp.customerName +
                 ", Movie: " + temp.movieName
             );
             found = true;
         }
         temp = temp.next;
     }while(temp != head);

     if(!found){
         System.out.println("No matching ticket found.");
     }
 }

 //Calculate total number of booked tickets
 public int countTickets(){
     if(head == null) return 0;

     int count = 0;
     Ticket temp = head;

     do{
         count++;
         temp = temp.next;
     }while(temp!=head);

     return count;
 }
}

