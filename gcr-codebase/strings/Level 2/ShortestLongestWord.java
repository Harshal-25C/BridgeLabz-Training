//Import java util package to access Scanner Class
import java.util.*;

public class ShortestLongestWord{
    //Method to find string length without using length()
    public static int findLength(String str){
        int count = 0;
        try{
            while(true){
                str.charAt(count);
                count++;
            }
        }catch(StringIndexOutOfBoundsException e){
        }
        return count;
    }

    //Method to split text into words without using split()
    public static String[] splitWords(String text){
        int len = findLength(text);
        int words = 1;

        for(int i=0; i<len; i++){
            if(text.charAt(i)==' '){
                words++;
            }
        }

        String[] wordArray = new String[words];
        String temp = "";
        int index = 0;

        for(int i=0; i<len; i++){
            char ch = text.charAt(i);
            if(ch != ' '){
                temp += ch;
            }else{
                wordArray[index++]=temp;
                temp = "";
            }
        }
        wordArray[index] = temp;
        return wordArray;
    }

    //Method to create 2D array of word and length
    public static String[][] createTable(String[] words){
        String[][] table = new String[words.length][2];

        for (int i=0; i<words.length; i++){
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }
        return table;
    }

    //Method to find shortest and longest word lengths
    public static int[] findShortestLongest(String[][] table){
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
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = createTable(words);
        int[] result = findShortestLongest(table);

        System.out.println("\nShortest word length: " + result[0]);
        System.out.println("Longest word length : " + result[1]);
    }
}
