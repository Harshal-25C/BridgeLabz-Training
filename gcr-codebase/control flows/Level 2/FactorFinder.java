import java.util.*;

public class FactorFinder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
        int number = sc.nextInt();

        System.out.println("Factors of " + number + " are:");

        if(number > 0){ 
		    // Find and print the factors
            for (int i = 1; i <number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
		}
    }
}
