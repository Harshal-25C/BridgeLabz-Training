import java.util.*;

public class HeightInFeetAndInches{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your height in Centimeter: ");
		//Take input as height in centimeter
        double cm = sc.nextDouble();

        //Convert centimeter into inches, 1 inch = 2.54, so divide centimeter by 2.54
        double inches = cm/2.54;
		
		//Convert inches in feet, 1 feet = 12 inches
		int feet = (int)inches/12;

        System.out.println("Your Height in cm is "+cm+" while in feet is "+feet+" and inches is "+ inches);
    }
}