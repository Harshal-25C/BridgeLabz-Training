//Import java util package for Scanner
import java.util.*;

public class AmarAkbarAnthony{
    public static void main(String[] args){
	    //Create a Scanner Class for taking User Input
	    Scanner sc = new Scanner(System.in);
		
		//Initialize number as a user input
		System.out.println("Enter the age of Amar: ");
		int amar_age = sc.nextInt();
		System.out.println("Enter the height of Amar(In feet): ");
		int amar_height = sc.nextInt();
		
		System.out.println("Enter the age of Akbar: ");
		int akbar_age = sc.nextInt();
		System.out.println("Enter the height of Akbar(In feet): ");
		int akbar_height = sc.nextInt();
		
		System.out.println("Enter the age of Anthony: ");
		int anthony_age = sc.nextInt();
		System.out.println("Enter the height of Anthony(In feet): ");
		int anthony_height = sc.nextInt();
		
		int smallest_age = Math.min(amar_age, Math.min(akbar_age, anthony_age));
		int largest_age = Math.max(amar_age, Math.max(akbar_age, anthony_age));
		
		int smallest_height = Math.min(amar_age, Math.min(akbar_age, anthony_age));
		int largest_height = Math.max(amar_age, Math.max(akbar_age, anthony_age));
		
		System.out.println("The youngest friend is : " + smallest_age);
		System.out.println("The tallest friend is : " + largest_height);
	}
}