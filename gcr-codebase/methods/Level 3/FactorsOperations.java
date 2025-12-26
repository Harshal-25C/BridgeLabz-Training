//import java util package to access Scanner class
import java.util.*;

public class FactorsOperations{
    //This method finds how many factors a number has
    public static int countFactors(int number){
        int count = 0;

        for (int i=1; i<=number; i++){
            if (number%i == 0){
                count++;
            }
        }
        return count;
    }

    //This method finds all factors and stores them in an array
    public static int[] findFactors(int number){
        int count=countFactors(number);
        int[] factors=new int[count];

        int index = 0;
        for(int i=1; i<=number; i++){
            if (number%i == 0){
                factors[index++] = i;
            }
        }
        return factors;
    }

    //This method finds the greatest factor from the array
    public static int greatestFactor(int[] factors) {
        int max = factors[0];

        for(int f : factors){
            if(f>max){
                max = f;
            }
        }
        return max;
    }

    //This method finds the sum of all factors
    public static int sumOfFactors(int[] factors){
        int sum=0;

        for(int f:factors){
            sum+=f;
        }
        return sum;
    }

    //This method finds the product of all factors
    public static long productOfFactors(int[] factors){
        long product=1;

        for(int f : factors){
            product*=f;
        }
        return product;
    }

    //This method finds the product of cubes of all factors
    public static double productOfCubes(int[] factors){
        double product = 1;

        for(int f : factors){
            product *= Math.pow(f,3);
        }
        return product;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors: ");
        for (int f : factors) {
            System.out.print(f + " ");
        }
        System.out.println();

        System.out.println("Greatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubes(factors));
    }
}
