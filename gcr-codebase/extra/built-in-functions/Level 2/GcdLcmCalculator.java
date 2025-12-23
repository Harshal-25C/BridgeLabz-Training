//Import java util package to access Scanner Class
import java.util.*;

public class GcdLcmCalculator{
    //Method to calculate GCD using Euclidean algorithm
    public static int findGCD(int a, int b){

        if(b == 0){
            return a;
        }
        return findGCD(b, a % b);
    }

    //Method to calculate LCM using GCD
    public static int findLCM(int a, int b){
        return (a*b)/findGCD(a, b);
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        //Take two numbers from user
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        //Call methods to find GCD and LCM
        System.out.println("GCD: " + findGCD(a, b));
        System.out.println("LCM: " + findLCM(a, b));
    }
}
