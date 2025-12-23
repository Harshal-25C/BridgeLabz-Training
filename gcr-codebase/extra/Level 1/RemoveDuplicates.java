//Import java util package to access Scanner class
import java.util.*;

public class RemoveDuplicates{
	//Create method to find duplicates in a String
    public static String removeDuplicatesInString(String txt){
        String result = "";
		for(int i=0; i<txt.length(); i++){
		    if(result.indexOf(txt.charAt(i)) == -1){
			    result += txt.charAt(i);
			}
		}
		return result;
    }
    public static void main(String[] args){
		//Initialize Scanner Class
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String txt = sc.next();
		
		//Access method removeDuplicatesInString
		String hk = removeDuplicatesInString(txt);
		
		System.out.println("Modified string is: " + hk);
	}
}