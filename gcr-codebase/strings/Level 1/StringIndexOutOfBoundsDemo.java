//Import java util package to access Scanner class
import java.util.*;

public class StringIndexOutOfBoundsDemo{
    //Method to generate StringIndexOutOfBoundsException
    static void generateException(String text){
        //Accessing character beyond string length
        System.out.println(text.charAt(text.length()));
    }

    //Method to handle StringIndexOutOfBoundsException
    static void handleException(String text){
        try{
            //Trying to access invalid index
            System.out.println(text.charAt(text.length()));
        }catch(StringIndexOutOfBoundsException e){
            //Handling runtime exception
            System.out.println("StringIndexOutOfBoundsException handled");
            System.out.println("Error Message: " + e.getMessage());
        }
    }

    public static void main(String[] args){
        //Initialize Scanner class 
        Scanner sc = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter a string: ");
        String input = sc.next();

        //Handling the exception safely
        handleException(input);

        sc.close();
    }
}
