import java.util.*;

public class TotalPurchasePrice{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the unit price (in INR): ");
        //Take the unitPrice as user input in double
        double unit_Price = sc.nextDouble();

        System.out.print("Enter the quantity: ");
        //Take the quantity as a user input
        int quantity = sc.nextInt();

        //Calculate the total price
        double total_Price = unit_Price * quantity;

        System.out.printf("The total purchase price is INR "+total_Price+" if the quantity "+quantity+" and unit price is INR "+unit_Price);
    }
}