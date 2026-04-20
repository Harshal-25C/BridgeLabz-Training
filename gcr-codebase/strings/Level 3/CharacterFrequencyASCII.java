//Import java util package to access Scanner Class
import java.util.*;

public class CharacterFrequencyASCII{
    //Method to find frequency and return 2D array
    public static String[][] findFrequency(String text){
        int[] freq = new int[256];

        //Count frequency of each character
        for(int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            freq[ch]++;
        }

        //Count unique characters
        int count = 0;
        for(int i=0; i<256; i++){
            if(freq[i] > 0){
                count++;
            }
        }

        //Create 2D array for result
        String[][] result = new String[count][2];
        int index = 0;

        //Store characters and their frequencies
        for(int i=0; i<256; i++){
            if(freq[i] > 0){
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(freq[i]);
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] frequency = findFrequency(text);

        System.out.println("\nCharacter\tFrequency");
        for(int i=0; i<frequency.length; i++){
            System.out.println(frequency[i][0] + "\t\t" + frequency[i][1]);
        }
    }
}
