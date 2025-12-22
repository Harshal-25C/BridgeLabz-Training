//Import java util package to access Scanner Class
import java.util.*;

public class StringSplitDemo{
    //Method to find string length without using length()
    public static int findLength(String text){
        int count = 0;
        try{
            while(true){
                text.charAt(count);
                count++;
            }
        }catch(StringIndexOutOfBoundsException e){
        }
        return count;
    }

    //Method to split text into words without using split()
    public static String[] customSplit(String text){
        int length = findLength(text);
        int wordCount = 1;

        //Count words
        for(int i = 0; i < length; i++){
            if(text.charAt(i) == ' '){
                wordCount++;
            }
        }
        //Store space indexes
        int[] spaceIndex = new int[wordCount + 1];
        int idx = 1;

        for(int i=0; i<length; i++){
            if(text.charAt(i)==' '){
                spaceIndex[idx++] = i;
            }
        }
        spaceIndex[0] = -1;
        spaceIndex[wordCount] = length;

        //Extract words
        String[] words = new String[wordCount];

        for (int i = 0; i < wordCount; i++){
            String word = "";
            for (int j=spaceIndex[i]+1; j<spaceIndex[i+1]; j++){
                word +=text.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    //Method to compare two string arrays
    public static boolean compareArrays(String[] a1, String[] a2){

        if(a1.length!=a2.length){
            return false;
        }
        for(int i=0; i<a1.length; i++){
            if(!a1[i].equals(a2[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complete text: ");
        String text = sc.nextLine();

        String[] customWords = customSplit(text);
        String[] builtInWords = text.split(" ");

        boolean result = compareArrays(customWords, builtInWords);

        System.out.println("Comparison result with built-in split(): " + result);
    }
}
