//Import java util package to access Scanner and String built-in methods
import java.util.*;

public class StringCharacterCompare{
    //User-defined method to return characters of a string
    public static char[] getCharacters(String text){
        //Create a character array of string length
        char[] chars=new char[text.length()];

        //Extract each character using charAt()
        for (int i=0; i<text.length(); i++){
            chars[i]=text.charAt(i);
        }
        //Return the character array
        return chars;
    }

    //Method to compare two character arrays
    public static boolean compareArrays(char[] arr1, char[] arr2){
        //If lengths are different, arrays are not equal
        if(arr1.length!=arr2.length){
            return false;
        }

        //Compare each character one by one
        for (int i=0; i<arr1.length; i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        //Arrays are equal
        return true;
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        //Take input from user
        System.out.print("Enter a string: ");
        String input = sc.next();

        //Call user-defined method
        char[] userArray = getCharacters(input);

        //Call built-in toCharArray() method
        char[] builtInArray = input.toCharArray();

        //Compare both arrays
        boolean result = compareArrays(userArray, builtInArray);

        //Display result
        System.out.println("Characters using user-defined method:");
        for(char c:userArray){
            System.out.print(c + " ");
        }

        System.out.println("\nCharacters using toCharArray():");
        for(char c:builtInArray){
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both character arrays equal? " + result);
    }
}
