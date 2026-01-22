package com.day10.GamingApp;
import java.util.Scanner;

public class GamingLeaderboard {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     LeaderboardBST leaderboard = new LeaderboardBST();
     int choice;

     do{
         System.out.println("\n--- Gaming Leaderboard Menu ---");
         System.out.println("1. Insert / Update Player");
         System.out.println("2. Display Top 10 Players");
         System.out.println("3. Remove Player");
         System.out.println("4. Exit");
         System.out.print("Enter choice: ");

         choice = sc.nextInt();
         sc.nextLine();

         switch (choice) {

             case 1:
                 System.out.print("Enter Player ID: ");
                 int id = sc.nextInt();
                 sc.nextLine();

                 System.out.print("Enter Player Name: ");
                 String name = sc.nextLine();

                 System.out.print("Enter Score: ");
                 int score = sc.nextInt();

                 leaderboard.insertOrUpdate(id, name, score);
                 System.out.println("Player inserted/updated successfully.");
                 break;

             case 2:
                 leaderboard.displayTopPlayers();
                 break;

             case 3:
                 System.out.print("Enter Player ID to remove: ");
                 leaderboard.removePlayer(sc.nextInt());
                 System.out.println("Player removed if existed.");
                 break;

             case 4:
                 System.out.println("Exiting Leaderboard...");
                 break;

             default:
                 System.out.println("Invalid choice!");
         }

     }while(choice != 4);

     sc.close();
 }
}
