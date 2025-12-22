//Import java util package to access Scanner Class
import java.util.*;

public class CustomTrimDemo{
    //Method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String text){
        int start = 0;
        int end = text.length() - 1;

        //Trim leading spaces
        while (start <= end && text.charAt(start) == ' '){
            start++;
        }

        //Trim trailing spaces
        while (end >= start && text.charAt(end) == ' '){
            end--;
        }
        return new int[]{start, end};
    }

    //Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end){
        String result = "";

        for(int i=start; i<=end; i++){
            result += text.charAt(i);
        }

        return result;
    }

    //Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2){

        if(s1.length()!=s2.length()){
            return false;
        }
        for(int i=0; i<s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);
        String customTrimmed = createSubstring(text, indexes[0], indexes[1]);

        String builtInTrimmed = text.trim();

        boolean result = compareStrings(customTrimmed, builtInTrimmed);

        System.out.println("\nCustom Trim Result : [" + customTrimmed + "]");
        System.out.println("Built-in Trim Result: [" + builtInTrimmed + "]");
        System.out.println("Comparison Result  : " + result);
    }
}
