package com.day10.HospitalQueueManagement;
import java.util.*;

public class HospitalQueueSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HospitalBST bst = new HospitalBST();
        int choice;

        do{
            System.out.println("\n--- Hospital Queue System ---");
            System.out.println("1. Register Patient");
            System.out.println("2. Discharge Patient");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Patient Name: ");
                    String name = sc.nextLine();
                    System.out.print("Arrival Time: ");
                    int time = sc.nextInt();
                    bst.register(id, name, time);
                    break;

                case 2:
                    System.out.print("Arrival Time to discharge: ");
                    bst.discharge(sc.nextInt());
                    break;

                case 3:
                    bst.display();
                    break;
            }
        }while(choice != 4);

    }
}
