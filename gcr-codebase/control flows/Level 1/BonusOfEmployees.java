//Import java util package for Scanner
import java.util.*;

public class BonusOfEmployees{
    public static void main(String[] args){
	    //Create a Scanner Class for taking User Input
	    Scanner sc = new Scanner(System.in);
		
		//Initialize salary and year_of_service as a user inputs
		System.out.println("Enter salary: ");
		double salary = sc.nextDouble();
		System.out.println("Enter year of service: ");
		int year_of_service = sc.nextInt();
		
		double bonus_amount = 0.0;

        //Check if years of service is more than 5 years
        if(year_of_service > 5){
            // Calculate 5% bonus (0.05 * salary)
            bonus_amount = 0.05 * salary;
			// Print the calculated bonus amount
            System.out.println("The employee is eligible for a 5% bonus.");
            System.out.println("Bonus amount: " + bonus_amount);
        } else {
            System.out.println("The employee is not eligible.");
        }
	}
}