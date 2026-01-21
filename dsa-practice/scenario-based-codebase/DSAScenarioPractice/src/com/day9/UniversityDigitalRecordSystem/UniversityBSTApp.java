package com.day9.UniversityDigitalRecordSystem;
import java.util.*;

public class UniversityBSTApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentBST bst = new StudentBST();
        int choice;

        do{
            System.out.println("\n--- University Digital Record System ---");
            System.out.println("1. Insert Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Search & Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    bst.insert(roll, name, dept);
                    break;

                case 2:
                    System.out.print("Enter Roll No to delete: ");
                    bst.delete(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter Roll No to search: ");
                    bst.search(sc.nextInt());
                    System.out.println();
                    bst.displayAll();
                    break;

                case 4:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

    }
}