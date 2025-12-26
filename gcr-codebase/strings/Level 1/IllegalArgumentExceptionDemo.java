//Import java util package to access Scanner class
import java.util.*;

public class IllegalArgumentExceptionDemo{
    //Method to generate IllegalArgumentException
    static void generateException(String text){
        //Start index is greater than end index
        System.out.println(text.substring(5,2));
    }

    //Method to handle IllegalArgumentException
    static void handleException(String text){
        try{
            //Invalid substring range
            System.out.println(text.substring(5, 2));
        }catch(IllegalArgumentException e){
            //Handling IllegalArgumentException
            System.out.println("IllegalArgumentException handled");
            System.out.println("Error Message: " + e.getMessage());
        }catch(RuntimeException e){
            //Handling any other runtime exception
            System.out.println("RuntimeException handled");
            System.out.println("Error Message: " + e.getMessage());
        }
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        //Handling the exception safely
        handleException(input);
    }
}
