//Import java.util package to access Scanner Class
import java.util.*;

public class TrainReservationQueue{
    public static void main(String[] args){
        //Access Scanner Class
        Scanner sc = new Scanner(System.in);
		//Initial seats
        int availableSeats = 5;

        while(true){

            System.out.println("\n--- Train Reservation Menu ---");
            System.out.println("1. Book Ticket");
            System.out.println("2. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    if(availableSeats > 0){
                        availableSeats--;
                        System.out.println("Ticket booked successfully.");
                        System.out.println("Remaining Seats: " + availableSeats);
                    }else{
                        System.out.println("No seats available.");
                        break; //stop booking
                    }
                    break;

                case 2:
                    System.out.println("Booking closed.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

            //Stop loop if seats are zero
            if(availableSeats == 0){
                System.out.println("All seats are booked. Reservation closed.");
                break;
            }
        }
    }
}
