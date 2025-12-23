//Import java util package to access Scanner class
import java.util.*;

public class ToggleCase{
	//Create method to convert string into toggle case
    public static String convertIntoToggleCase(String txt){
		String result = "";
		
		for(int i=0; i<txt.length(); i++){
		    char ch = txt.charAt(i);
		    if(Character.isUpperCase(ch)){
			    result += Character.toLowerCase(ch);
			}else if(Character.isLowerCase(ch)){
			    result += Character.toUpperCase(ch);
			}
		}
		return result;
    }
    public static void main(String[] args){
		//Initialize Scanner Class
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String txt = sc.nextLine();
		
		//Access method convertIntoToggleCase
		String hk = convertIntoToggleCase(txt);
		
		System.out.println("The toggle case of String "+txt+" is "+hk);
	}
}