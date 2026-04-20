//Import java util package to access Scanner Class
import java.util.*;

public class WordAnalysis{
    //Method to find string length without using length()
    public static int findLength(String text){
        int count = 0;
        try{
            while(true){
                text.charAt(count);
                count++;
            }
        }catch(StringIndexOutOfBoundsException e){
            //End of string reached
        }
        return count;
    }

    //Method to split text into words without using split()
    public static String[] splitWords(String text){
        int len = findLength(text);
        int wordCount = 1;

        //Count number of words
        for(int i=0; i<len; i++){
            if(text.charAt(i)==' '){
                wordCount++;
            }
        }

        //Store space indexes
        int[] spaceIndex = new int[wordCount + 1];
        spaceIndex[0] = -1;

        int idx=1;
        for (int i=0; i<len; i++){
            if (text.charAt(i)==' '){
                spaceIndex[idx++]=i;
            }
        }
        spaceIndex[wordCount] = len;

        //Extract words
        String[] words = new String[wordCount];
        for (int i=0; i<wordCount; i++){
            String word = "";
            for (int j=spaceIndex[i]+1; j<spaceIndex[i+1]; j++){
                word += text.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    //Method to create 2D array of word and its length
    public static String[][] createWordLengthTable(String[] words){
        String[][] table = new String[words.length][2];

        for(int i=0; i<words.length; i++){
            int length = findLength(words[i]);
            table[i][0] = words[i];
            table[i][1] = String.valueOf(length);
        }
        return table;
    }

    //Method to find shortest and longest word lengths
    public static int[] findShortestAndLongest(String[][] table){

        int shortest = Integer.parseInt(table[0][1]);
        int longest = Integer.parseInt(table[0][1]);

        for(int i=1; i<table.length; i++){
            int len = Integer.parseInt(table[i][1]);

            if(len<shortest){
                shortest = len;
            }
            if(len>longest){
                longest = len;
            }
        }
        return new int[]{shortest, longest};
    }

    public static void main(String[] args){
        //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter complete text: ");
        String text = sc.nextLine();

        //Split words
        String[] words = splitWords(text);

        //Create 2D array of word and length
        String[][] table = createWordLengthTable(words);

        //Display in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("---------------------");

        for (int i = 0; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            System.out.println(table[i][0] + "\t\t" + len);
        }

        // Find shortest and longest words
        int[] result = findShortestAndLongest(table);

        System.out.println("\nShortest word length: " + result[0]);
        System.out.println("Longest word length : " + result[1]);
	}
}
