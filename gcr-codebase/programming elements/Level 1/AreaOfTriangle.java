import java.util.*;

public class AreaOfTriangle{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter base in inches: ");
		//Take input as base in inches
        double base = sc.nextDouble();
		System.out.println("Enter height in inches: ");
		double height = sc.nextDouble();
		
		//Area of a Triangle is ½ * base * height    
		double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches* 6.4516;
		
        System.out.println("area of a triangle in square inches is "+areaInInches+" and square centimeters is "+areaInCm);
    }
}