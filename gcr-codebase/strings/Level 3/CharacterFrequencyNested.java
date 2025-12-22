//Import java util package to access Scanner Class
import java.util.*;

public class CharacterFrequencyNested{
    //Method to find frequency using nested loops
    public static String[] findFrequency(String text){

        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        //Initialize frequency
        for(int i=0; i<chars.length; i++){
            freq[i] = 1;
        }

        //Nested loops to calculate frequency
        for(int i=0; i<chars.length; i++) {
            if(chars[i] == '0'){
                continue;
            }
            for (int j=i+1; j<chars.length; j++){
                if(chars[i] == chars[j]){
                    freq[i]++;
                    chars[j] = '0'; //Mark duplicate
                }
            }
        }

        //Count unique characters
        int count = 0;
        for(int i=0; i<chars.length; i++){
            if(chars[i] != '0'){
                count++;
            }
        }

        //Store result in 1D String array
        String[] result = new String[count];
        int index = 0;

        for(int i=0; i<chars.length; i++){
            if(chars[i] != '0'){
                result[index++] = chars[i] + " : " + freq[i];
            }
        }
        return result;
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] frequency = findFrequency(text);

        System.out.println("\nCharacter Frequency:");
        for(String s : frequency){
            System.out.println(s);
        }
    }
}
