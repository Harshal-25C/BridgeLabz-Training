package com.day9.MusicAppOrganizeSongsbyTrackID;
import java.util.*;

public class MusicApp {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     MusicLibraryBST library = new MusicLibraryBST();
     int choice;

     //Sample tracks
     library.insert(101, "Believer", "Imagine Dragons");
     library.insert(102, "Closer", "Chainsmokers");
     library.insert(103, "Faded", "Alan Walker");
     library.insert(104, "Alone", "Marshmello");

     do{
         System.out.println("\n--- Music Library Menu ---");
         System.out.println("1. Search Track by Track ID");
         System.out.println("2. Insert New Track");
         System.out.println("3. Show Playlist Alphabetically");
         System.out.println("4. Exit");
         System.out.print("Enter choice: ");

         choice = sc.nextInt();
         sc.nextLine();

         switch(choice){

             case 1:
                 System.out.print("Enter Track ID: ");
                 library.searchByTrackId(sc.nextInt());
                 break;

             case 2:
                 System.out.print("Enter Track ID: ");
                 int id = sc.nextInt();
                 sc.nextLine();

                 System.out.print("Enter Song Title: ");
                 String title = sc.nextLine();

                 System.out.print("Enter Artist Name: ");
                 String artist = sc.nextLine();

                 library.insert(id, title, artist);
                 System.out.println("Track added successfully.");
                 break;

             case 3:
                 library.displayPlaylist();
                 break;

             case 4:
                 System.out.println("Exiting Music App...");
                 break;

             default:
                 System.out.println("Invalid choice!");
         }

     }while(choice != 4);
   }
}
