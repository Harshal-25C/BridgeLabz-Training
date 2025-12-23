//Import java util package to access Scanner Class
import java.util.*;

public class FactorialRecursion{
    //Recursive method to calculate factorial
    public static int factorial(int n){

        //Base condition
        if(n==0 || n==1){
            return 1;
        }

        //Recursive call
        return n*factorial(n-1);
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        //Take number from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        //Call recursive method
        int result = factorial(num);

        //Display factorial
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
