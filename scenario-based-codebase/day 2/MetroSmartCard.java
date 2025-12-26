//Initialize java util package to access Scanner Class
import java.util.Scanner;

public class MetroSmartCard{
    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        double balance = 200; //Initial smart card balance

        while(balance > 0){

            System.out.println("\nCurrent Balance: ₹" + balance);
            System.out.print("Enter distance in km (Enter -1 to quit): ");
            int distance = sc.nextInt();

            //Exit condition
            if(distance == -1){
                System.out.println("Thank you for using Delhi Metro.");
                break;
            }

            //Calculate fare using ternary operator
            double fare = (distance <= 5) ? 20 : (distance <= 10) ? 40 : 60;

            //Check balance
            if(balance >= fare){
                balance = balance-fare;
                System.out.println("Fare Deducted: ₹" + fare);
            }else{
                System.out.println("Insufficient balance. Journey not allowed.");
                break;
            }
        }
    }
}
