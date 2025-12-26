//Import java util package to access Scanner Class
import java.util.*;

public class CoffeeCounter{
    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        //GST percentage
        double gstRate = 0.05; //5% GST

        //While loop to keep serving customers
        while(true){
            //Ask user for coffee type
            System.out.println("\nAvailable Coffees:");
            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            System.out.println("3. Cappuccino");
            System.out.println("Type 'exit' to stop");

            System.out.print("Enter coffee type: ");
            String coffeeType = sc.next();

            //Stop program if user types exit
            if(coffeeType.equalsIgnoreCase("exit")){
                System.out.println("Thank you! Cafe is now closed.");
                break;
            }

            //Ask for quantity
            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double pricePerCup = 0;

            //Switch case to decide coffee price
            switch(coffeeType.toLowerCase()){
                case "espresso":
                    pricePerCup = 100;
                    break;

                case "latte":
                    pricePerCup = 120;
                    break;

                case "cappuccino":
                    pricePerCup = 150;
                    break;

                default:
                    System.out.println("Invalid coffee type. Please try again.");
                    continue;
            }

            //Calculate total price
            double totalPrice = pricePerCup*quantity;

            //Calculate GST
            double gstAmount = totalPrice*gstRate;

            //Calculate final bill
            double finalBill = totalPrice+gstAmount;

            //Display bill details
            System.out.println("\n----- Bill Details -----");
            System.out.println("Coffee Type : " + coffeeType);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Price       : ₹" + totalPrice);
            System.out.println("GST (5%)    : ₹" + gstAmount);
            System.out.println("Final Bill  : ₹" + finalBill);
        }
    }
}
