//import java util package to access Scanner Class
import java.util.*;

public class RechargeSimulator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double balance = 0;
        char choice;

        //Loop allows repeated recharges
        do{
            System.out.print("Enter Mobile Operator (Jio/Airtel/VI): ");
            String operator = sc.next();

            System.out.print("Enter Recharge Amount: ");
            double amount = sc.nextDouble();
			//Update balance
            balance += amount;

            //switch-case to show offers
            switch (operator.toLowerCase()){
                case "jio":
                    System.out.println("Offer: 2GB/day for 28 days");
                    break;
                case "airtel":
                    System.out.println("Offer: Unlimited calls + 1.5GB/day");
                    break;
                case "vi":
                    System.out.println("Offer: Weekend data rollover");
                    break;
                default:
                    System.out.println("No offers available");
            }

            //Display updated balance
            System.out.println("Current Balance: ₹" + balance);

            System.out.print("Do you want to recharge again? (Y/N): ");
            choice = sc.next().charAt(0);

        }while(choice == 'Y'|| choice == 'y');
    }
}
