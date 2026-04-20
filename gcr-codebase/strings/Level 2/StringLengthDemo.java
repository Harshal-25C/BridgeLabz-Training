//Import java util package to access Scanner Class
import java.util.*;

public class StringLengthDemo{
    //User-defined method to find string length without using length()
    public static int findLength(String text){
        int count = 0;

        try{
            while(true){
                text.charAt(count);
                count++;
            }
        }catch(StringIndexOutOfBoundsException e){
            //Exception occurs when index exceeds string length
        }
        return count;
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String text = sc.next();

        int customLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length using user-defined method: " + customLength);
        System.out.println("Length using built-in length(): " + builtInLength);
    }
}
