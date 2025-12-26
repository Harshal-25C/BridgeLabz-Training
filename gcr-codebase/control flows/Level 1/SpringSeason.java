//Import java util package for Scanner
import java.util.*;

public class SpringSeason{
    public static void main(String[] args){
	    //Create a Scanner Class
	    Scanner sc = new Scanner(System.in);
		
		//Initialize month and day as a user inputs
		System.out.println("Enter a month: ");
		int month = sc.nextInt();
		System.out.println("Enter a Day: ");
		int day = sc.nextInt();
		
		//Check if the month and day are between March 20 to June 20
		boolean isSpring = (month==3 && day >= 20 && day <= 31) || (month==4 && day >= 1 && day <= 30) || (month==5 && day >= 1 && day <= 31) ||
                           (month==6 && day >=1 && day <= 20);

        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
	}
}