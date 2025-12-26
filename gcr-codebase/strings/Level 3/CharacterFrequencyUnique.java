//Import java util package to access Scanner Class
import java.util.*;

public class CharacterFrequencyUnique{
    //Method to find unique characters using charAt()
    public static char[] uniqueCharacters(String text){

        char[] temp = new char[text.length()];
        int uniqueCount = 0;

        for(int i=0; i<text.length(); i++){
            char current = text.charAt(i);
            boolean isUnique = true;

            for(int j=0; j<i; j++){
                if(current==text.charAt(j)){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                temp[uniqueCount++] = current;
            }
        }

        char[] unique = new char[uniqueCount];
        for(int i=0; i<uniqueCount; i++){
            unique[i] = temp[i];
        }
        return unique;
    }

    //Method to find frequency using unique characters
    public static String[][] findFrequencyUsingUnique(String text){
        int[] freq = new int[256];

        //Count frequency
        for(int i=0; i<text.length(); i++){
            freq[text.charAt(i)]++;
        }

        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        // Store character and frequency
        for(int i=0; i<uniqueChars.length; i++){
            result[i][0] = Character.toString(uniqueChars[i]);
            result[i][1] = Integer.toString(freq[uniqueChars[i]]);
        }
        return result;
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] frequency = findFrequencyUsingUnique(text);

        System.out.println("\nCharacter\tFrequency");
        for(int i=0; i<frequency.length; i++){
            System.out.println(frequency[i][0] + "\t\t" + frequency[i][1]);
        }
    }
}
