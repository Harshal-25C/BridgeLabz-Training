//Import java util package to access Scanner class
import java.util.*;

public class ReverseString{
	//Create method to reverse string
    public static String revString(String txt){
		//Initialize one String named result to store reverse characters
	    String result = "";
		//Interating loop from length-1 to 0
	    for(int i=txt.length()-1; i>=0; i--){
			result += txt.charAt(i);
		}
		return result;
	}
    public static void main(String[] args){
		//Initialize Scanner Class
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String txt = sc.next();
		
		int n = txt.length();
		
		//Access method revString
		String hk = revString(txt);
		
		System.out.println("Reversed String of "+txt+" is: " + hk);
	}
}