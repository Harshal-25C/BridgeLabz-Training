//Import java util package to access Scanner Class
import java.util.*;

public class AnagramCheck{
    //Method to check if two texts are anagrams
    public static boolean isAnagram(String text1, String text2){
        //Check length
        if(text1.length() != text2.length()){
            return false;
        }

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        //Find frequency of characters in first text
        for(int i=0; i<text1.length(); i++){
            char ch = text1.charAt(i);
            freq1[ch]++;
        }

        //Find frequency of characters in second text
        for(int i=0; i<text2.length(); i++){
            char ch = text2.charAt(i);
            freq2[ch]++;
        }

        //Compare frequency arrays
        for(int i=0; i<256; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        boolean result = isAnagram(text1, text2);

        if(result){
            System.out.println("The given texts are Anagrams");
        }else{
            System.out.println("The given texts are NOT Anagrams");
        }
    }
}
