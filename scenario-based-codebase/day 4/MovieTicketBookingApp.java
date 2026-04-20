//Import java util package to access Scanner Class
import java.util.*;

public class MovieTicketBookingApp{
    //Method to calculate total ticket price
    static double calculateBill(String movieType, String seatType, boolean snacks){
        double ticketPrice = 0;

        // Decide base ticket price using switch
        switch (movieType.toLowerCase()) {
            case "action":
                ticketPrice = 200;
                break;
            case "comedy":
                ticketPrice = 180;
                break;
            case "drama":
                ticketPrice = 150;
                break;
            default:
                System.out.println("Invalid movie type");
                return 0;
        }

        //Seat type price addition using if
        if(seatType.equalsIgnoreCase("gold")){
            ticketPrice += 100;
        }else if(seatType.equalsIgnoreCase("silver")){
            ticketPrice += 50;
        }

        //Add snacks cost if selected
        if(snacks){
            ticketPrice += 80;
        }
        return ticketPrice;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\nEnter movie type (Action / Comedy / Drama) or type 'exit': ");
            String movieType = scanner.nextLine();

            //Exit condition
            if(movieType.equalsIgnoreCase("exit")){
                System.out.println("Booking closed. Thank you!");
                break;
            }

            System.out.print("Enter seat type (Gold / Silver): ");
            String seatType = scanner.nextLine();

            System.out.print("Do you want snacks? (yes/no): ");
            String snackChoice = scanner.nextLine();
            boolean snacks = snackChoice.equalsIgnoreCase("yes");

            double totalAmount = calculateBill(movieType, seatType, snacks);

            System.out.println("Total Ticket Bill: ₹" + totalAmount);
        }
    }
}
