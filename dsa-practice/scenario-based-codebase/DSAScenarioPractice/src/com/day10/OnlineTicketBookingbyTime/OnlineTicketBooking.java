package com.day10.OnlineTicketBookingbyTime;
import java.util.Scanner;

public class OnlineTicketBooking {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     EventBST bst = new EventBST();
     int choice;

     do{
         System.out.println("\n--- Ticket Booking System ---");
         System.out.println("1. Add Event");
         System.out.println("2. Cancel Event");
         System.out.println("3. Show Events");
         System.out.println("4. Exit");
         System.out.print("Choice: ");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Event ID: ");
                 int id = sc.nextInt();
                 sc.nextLine();
                 System.out.print("Event Name: ");
                 String name = sc.nextLine();
                 System.out.print("Event Time: ");
                 int time = sc.nextInt();
                 bst.insert(id, name, time);
                 break;

             case 2:
                 System.out.print("Enter Event Time to cancel: ");
                 bst.delete(sc.nextInt());
                 break;

             case 3:
                 bst.display();
                 break;
         }
     }while(choice != 4);

 }
}
