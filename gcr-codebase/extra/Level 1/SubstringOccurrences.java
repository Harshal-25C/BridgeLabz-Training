//Import java util package to access Scanner class
import java.util.*;

public class SubstringOccurrences{
	//Create method to find substring occurrences
    public static int findSubstringOccurrences(String txt, String subStr){
		int count = 0;
		
		for(int i=0; i<= txt.length()-subStr.length(); i++){
		    if(txt.substring(i, i+subStr.length()).equals(subStr)){
			    count++;
			}
		}
		return count;
    }
    public static void main(String[] args){
		//Initialize Scanner Class
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String txt = sc.nextLine();
		
		System.out.println("Enter Sub String : ");
		String subStr= sc.nextLine();
		
		//Access method findLongestWordInString
		int hk = findSubstringOccurrences(txt, subStr);
		
		System.out.println("Substring occurrences "+hk);
	}
}