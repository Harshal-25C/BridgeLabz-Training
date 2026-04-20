//Import java util package for Scanner
import java.util.*;

public class CheckFirstSmallestOrNot{
    public static void main(String[] args){
	    //Create a Scanner Class
	    Scanner sc = new Scanner(System.in);
		
		//Initialize number1, number 2 and number 3 as user inputs
		System.out.println("Enter 1st number: ");
		int number_1 = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int number_2 = sc.nextInt();
		System.out.println("Enter 3rd number: ");
		int number_3 = sc.nextInt();
		
		//Check if the 1st number is smallest then other two or not
		if((number_2 > number_1) && (number_3 > number_1)){
		    System.out.println("Is the first number the smallest? Yes");
		}else{
		    System.out.println("Is the first number the smallest? No");
		}
	}
}