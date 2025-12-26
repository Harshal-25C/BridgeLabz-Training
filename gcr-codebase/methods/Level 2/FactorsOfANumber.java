//Import java util package to access Scanner class
import java.util.*;

public class FactorsOfANumber{
    //Method to find factors
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i=1; i<=number; i++) {
            if (number%i == 0) {
                count++;
            }
        }
		
        int[] factors = new int[count];
        int index = 0;

        //Storing factors in array
        for (int i=1; i<=number; i++) {
            if (number%i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    //Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    //Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    //Method to find sum of squares of factors
    public static double sumOfSquares(int[] factors) {
        double sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
		//Initialize Scanner class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.println("Factors of " + number + ":");
        for (int factor : factors){
            System.out.print(factor + " ");
        }

        System.out.println("\nSum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
    }
}
