import java.util.*;

public class CelToFeh{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the tem. in Celsius: ");
		double celsius = sc.nextDouble();
		
		double fehrenheit = (celsius*9/5) + 32;
		System.out.println("Temperature in fehrenheit: "+ fehrenheit);
	}
}