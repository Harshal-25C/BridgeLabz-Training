//Import java util package to access Scanner class
import java.util.*;

public class LongestWordInSentence{
	//Create method to find Longest Word In Sentence
    public static String findLongestWordInString(String txt){
        String[] result = txt.split(" ");
		
		String longestWord = "";
		
		for(int i=0; i<result.length; i++){
		    if(result[i].length() > longestWord.length()){
			    longestWord = result[i];
			}
		}
		return longestWord;
    }
    public static void main(String[] args){
		//Initialize Scanner Class
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String txt = sc.nextLine();
		
		//Access method findLongestWordInString
		String hk = findLongestWordInString(txt);
		
		System.out.println("Longest word in sentence: "+hk);
	}
}