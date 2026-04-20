//Import java util package to access Scanner Class
import java.util.*;

public class FirstNonRepeatingChar{
    //Method to find first non-repeating character
    public static char findFirstNonRepeating(String text){

        int[] freq = new int[256];

        //Count frequency of characters
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            freq[ch]++;
        }

        //Find first non-repeating character
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if(freq[ch] == 1){
                return ch;
            }
        }

        return '\0'; //Indicates no non-repeating character
    }

    public static void main(String[] args) {
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char result = findFirstNonRepeating(text);

        if(result != '\0'){
            System.out.println("First non-repeating character: " + result);
        }else{
            System.out.println("No non-repeating character found");
        }
    }
}
