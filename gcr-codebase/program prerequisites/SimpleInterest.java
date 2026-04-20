import java.util.*;

public class SimpleInterest{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter pricipal: ");
		double principal = sc.nextDouble();
		
		System.out.println("Enter rate: ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter time: ");
		double time = sc.nextDouble();
		
		double simpInterest = (principal*rate*time)/100;
		System.out.println(simpInterest);
	}
}