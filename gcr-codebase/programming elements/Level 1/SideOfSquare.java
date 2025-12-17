import java.util.*;

public class SideOfSquare{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("Enter perimeter: ");
		//Take input as perimeter
        double perimeter = sc.nextDouble();

        //Perimeter of Square is 4 times side
        double side = perimeter/4;

        System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
    }
}