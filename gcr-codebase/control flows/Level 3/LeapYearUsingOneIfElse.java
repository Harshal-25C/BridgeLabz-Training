//Import java util package for Scanner
import java.util.*;

public class LeapYearUsingOneIfElse{
    public static void main(String[] args){
	    //Create a Scanner Class for taking User Input
		Scanner sc = new Scanner(System.in);

        //Take year as input from user
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
 
        //Check leap year using one if condition
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("Year is a Leap Year");
        } else {
            System.out.println("Year is not a Leap Year");
        }
    }
}