//Import java util package to access Scanner Class
import java.util.*;

public class BasicCalculator{
    //Method for addition
    public static double add(double a, double b){
        return a+b;
    }

    //Method for subtraction
    public static double subtract(double a, double b){
        return a-b;
    }

    //Method for multiplication
    public static double multiply(double a, double b){
        return a*b;
    }

    //Method for division
    public static double divide(double a, double b){
        if(b == 0){
            System.out.println("Division by zero is not allowed");
            return 0;
        }
        return a/b;
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        //Display menu to the user
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        //Take user choice
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        //Take two numbers from user
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        //Perform operation based on choice
        switch (choice) {
            case 1:
                System.out.println("Result: " + add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case 4:
                System.out.println("Result: " + divide(num1, num2));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
