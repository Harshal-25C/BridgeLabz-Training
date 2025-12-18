import java.util.*;

public class FactorFinderUsingWhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
        int number = sc.nextInt();

        System.out.println("Factors of " + number + " are:");

        if(number > 0){ 
		    //Find and print the factors using while loop
			int i=1;
            while(i<number) {
                if (number % i == 0) {
                    System.out.println(i);
                }
				i++;
            }
		}
    }
}