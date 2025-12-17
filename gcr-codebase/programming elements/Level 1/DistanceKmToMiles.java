import java.util.*;

public class DistanceKmToMiles{
    public static void main(String[] args){
	    //Create a scanner with name 'sc'
        Scanner sc = new Scanner(System.in);
		
		//Initialize kilometers as a double integer to take kilometer user input
		double kilometers = sc.nextDouble();
		
		//Use 1 mile = 1.6 km formulae to calculate miles
		double miles = kilometers * 1.6;

        System.out.println("The total miles is "+miles+" mile for the given "+kilometers+ "km");
    }
}