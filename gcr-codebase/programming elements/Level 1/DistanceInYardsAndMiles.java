import java.util.*;

public class DistanceInYardsAndMiles{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
	    System.out.print("Enter the distance in feet: ");
		double distance = sc.nextInt();

        // Calculate distance in yards and miles
        double distanceInYards = distance/3.0;
		// 3 feet * 1760 yards
        double distanceInMiles = distance/5280.0;

        System.out.println("The distance in feet is " + distance + " and in yards is " + distanceInYards+ " As well as in miles is " +distanceInMiles);
        
    }
}