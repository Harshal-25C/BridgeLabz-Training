//Import java util package for Scanner
import java.util.*;

public class CalculatorUsingSwitchCase{
    public static void main(String[] args) {
        //Create a Scanner Class for taking User Input
        Scanner sc = new Scanner(System.in);

        //Initialize two numbers as an inputs
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        //Switch-case for calculator
        switch (op) {
            case "+":
                System.out.println("Result = " +(first+second));
                break;

            case "-":
                System.out.println("Result = " +(first-second));
                break;

            case "*":
                System.out.println("Result = "+(first*second));
                break;

            case "/":
                System.out.println("Result = " + (first / second));
                break;

            default:
                System.out.println("Invalid Operator");
        }
        //Close the scanner
        sc.close();
    }
}
