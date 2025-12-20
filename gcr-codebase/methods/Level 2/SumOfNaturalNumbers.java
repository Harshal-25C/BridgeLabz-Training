//Import java util package to access Scanner class
import java.util.*;

public class SumOfNaturalNumbers{
    //Recursive method
    public static int sumUsingRecursion(int number){
        if(number==0){
            return 0;
        }
        return number + sumUsingRecursion(number-1);
    }

    //Formula method
    public static int sumUsingFormula(int number){
        return number*(number + 1)/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if(number<=0){
            System.out.println("Please enter a natural number.");
        }else{
            int recursiveSum = sumUsingRecursion(number);
            int formulaSum = sumUsingFormula(number);
			
			//if both values are same 
            if(recursiveSum == formulaSum){
                System.out.println("Both are equal and the Sum of natural number is: " + recursiveSum);
            }else{
                System.out.println("Both are not equal");
            }
        }
    }
}
