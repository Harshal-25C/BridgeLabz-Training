//Import java util package to access java util package
import java.util.*;

public class BusRouteDistanceTracker{
    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);
        int totalDistance = 0;
        char stopChoice = 'n';

        while(stopChoice!='y' && stopChoice!='Y'){
            System.out.print("Enter distance for this stop (in km): ");
            int distance = sc.nextInt();
            totalDistance += distance;

            System.out.print("Do you want to get off here? (y/n): ");
            stopChoice = sc.next().charAt(0);
        }

        System.out.println("Total distance traveled: " + totalDistance + " km");
    }
}
