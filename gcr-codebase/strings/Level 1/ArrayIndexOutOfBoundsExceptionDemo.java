//Import java util package to access Scanner Class
import java.util.*;

public class ArrayIndexOutOfBoundsExceptionDemo{
    //Method to generate ArrayIndexOutOfBoundsException
    //This method does NOT handle the exception
    static void generateException(String[] names, int index){
        //Accessing index greater than array length
        System.out.println("Name: " + names[index]);
    }

    //Method to handle ArrayIndexOutOfBoundsException using try-catch
    static void handleException(String[] names, int index){
        try{
            System.out.println("Name: " + names[index]);
        }catch(ArrayIndexOutOfBoundsException e){
            // Handles specific array index exception
            System.out.println("ArrayIndexOutOfBoundsException caught: Invalid index.");
        }catch(RuntimeException e){
            //Handles any other runtime exception
            System.out.println("RuntimeException caught.");
        }
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        //Taking array size input
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();

        String[] names = new String[size];

        //Taking names input
        for (int i=0; i<size; i++) {
            System.out.print("Enter name " + (i+1) + ": ");
            names[i] = sc.next();
        }

        //Taking index input
        System.out.print("Enter index to access: ");
        int index = sc.nextInt();

        //Calling method that handles exception
        handleException(names, index);
    }
}
