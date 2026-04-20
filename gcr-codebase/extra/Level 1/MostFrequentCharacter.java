//Import java util package to access Scanner class
import java.util.*;

public class MostFrequentCharacter{
    public static void findMostFrequentChar(String str){
        int[] freq = new int[256]; // ASCII characters

        //Count frequency of each character
        for(int i=0; i<str.length(); i++){
            freq[str.charAt(i)]++;
        }

        char mostFrequent = str.charAt(0);
        int maxCount = freq[mostFrequent];

        //Find the character with highest frequency
        for(int i=1; i<str.length(); i++){
            if(freq[str.charAt(i)] > maxCount){
                maxCount = freq[str.charAt(i)];
                mostFrequent = str.charAt(i);
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }

    public static void main(String[] args){
	    //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        findMostFrequentChar(str);
    }
}
