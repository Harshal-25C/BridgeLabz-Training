//Import java util to access Scanner Class
import java.util.*;

public class FibonacciGenerator{

    //Method to generate and print Fibonacci sequence
    public static void printFibonacci(int terms){

        int a = 0, b = 1;

        //Print Fibonacci numbers up to given terms
        for(int i=1; i<=terms; i++){
            System.out.print(a + " ");

            int next = a+b;
            a = b;
            b = next;
        }
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        //Take number of terms from user
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        //Call method to print Fibonacci sequence
        printFibonacci(terms);
    }
}
