//Import java util package to access Scanner Class
import java.util.*;

public class PalindromeCheck{
    //Logic 1
    public static boolean isPalindromeIterative(String text){
        int start = 0;
        int end = text.length() - 1;

        while(start < end){
            if (text.charAt(start) != text.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    //Logic 2
    public static boolean isPalindromeRecursive(String text, int start, int end){
        if(start >= end){
            return true;
        }
        if(text.charAt(start) != text.charAt(end)){
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    //Reverse method
    public static char[] reverseString(String text){
        char[] reverse = new char[text.length()];
        int index = 0;

        for(int i=text.length()-1; i>=0; i--){
            reverse[index++] = text.charAt(i);
        }
        return reverse;
    }

    //Logic 3
    public static boolean isPalindromeArray(String text){
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for(int i=0; i<original.length; i++){
            if(original[i] != reverse[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        //Printing Results
        System.out.println("\nPalindrome Check Results:");
        System.out.println("Logic 1 (Iterative): " + isPalindromeIterative(text));
        System.out.println("Logic 2 (Recursive): " + isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Logic 3 (Array): " + isPalindromeArray(text));
    }
}
