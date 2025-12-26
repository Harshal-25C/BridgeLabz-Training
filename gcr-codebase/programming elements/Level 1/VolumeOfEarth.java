import java.util.*;

public class VolumeOfEarth{
    public static void main(String[] args){
        double radius_earth = 6378;
		
		double volume_of_sphere = (4.0/3.0) * Math.PI * Math.pow(radius_earth, 3);
		double km_to_miles = 0.621371;
		
		double radius_miles = radius_earth * km_to_miles;
		
		double volume_of_miles = (4.0/3.0) * Math.PI * Math.pow(radius_miles, 3);

        System.out.println("The volume of earth in cubic kilometers is "+ volume_of_sphere+" and cubic miles is "+ volume_of_miles);
    }
}