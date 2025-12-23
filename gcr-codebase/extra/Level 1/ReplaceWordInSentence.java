//Import java util package to access Scanner class
import java.util.*;

public class ReplaceWordInSentence{
    //Initialize method replaceWord
    public static String replaceWord(String sentence, String oldWord, String newWord){
        String[] words = sentence.split(" ");
        String result = "";

        for(int i=0; i<words.length; i++){
            if(words[i].equals(oldWord)){
                result += newWord + " ";
            }else{
                result += words[i] + " ";
            }
        }
        return result.trim();
    }

    public static void main(String[] args){
	    //Initialize Scanner Class
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter new word: ");
        String newWord = sc.next();

        String updatedSentence = replaceWord(sentence, oldWord, newWord);

        System.out.println("Updated Sentence: "+updatedSentence);
    }
}
