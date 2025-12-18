//Import java util package for Scanner
import java.util.*;

public class LeapYear{
    public static void main(String[] args){
	    //Create a Scanner Class for taking User Input
		Scanner sc = new Scanner(System.in);

        //Take year as input from user
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
 
        //Check if year is divisible by 400
        if(year%400 == 0){
            System.out.println("Year is a Leap Year");
        } 
        //Check if year is divisible by 100
        else if(year%100 == 0){
            System.out.println("Year is not a Leap Year");
        } 
        //Check if year is divisible by 4
        else if(year%4 == 0){
            System.out.println("Year is a Leap Year");
        } 
        //Remaining years are not leap years
        else{
            System.out.println("Year is not a Leap Year");
        }
    }
}