//Imported java util package to access Scanner Class
import java.util.*;

public class ParkingLotSystem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Maximum parking capacity
        int capacity = 5;    
		
		// Current occupied slots
        int occupied = 0;
        int choice;

        //while loop runs until parking is full or user exits
        while (occupied < capacity){
            System.out.println("\n1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit System");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            //switch-case for menu selection
            switch(choice){
                case 1:
                    if(occupied<capacity){
                        occupied++;
                        System.out.println("Vehicle parked successfully.");
                    }
                    break;

                case 2:
                    if(occupied > 0){
                        occupied--; 
                        System.out.println("Vehicle exited successfully.");
                    }
                    break;

                case 3:
                    //Display current parking status
                    System.out.println("Occupied Slots: " + occupied + "/" + capacity);
                    break;

                case 4:
                    //Exit the system manually
                    System.out.println("Exiting system...");
                    sc.close();
                    return;

                default:
                    //Invalid menu option
                    System.out.println("Invalid choice!");
            }
        }

        //Executes when parking becomes full
        System.out.println("Parking Lot is FULL!");
    }
}
