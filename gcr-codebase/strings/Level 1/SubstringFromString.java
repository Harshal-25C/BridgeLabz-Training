//Import java util package to access Scanner class and String built-in methods
import java.util.*;

public class SubstringFromString{
    //Write method createManualSubString to create a substring
    public static String createManualSubString(String text, int start, int end){
	    String manualSubstring = "";
	    for(int i=start; i<end; i++){
		    manualSubstring += text.charAt(i);
		}
		return manualSubstring;
	}
	 
	//Compare two substrings
	public static boolean compareTwoSubstrings(String builtInSubstring, String manualSubstring){
	    boolean compare = false;
		
		if(builtInSubstring.equals(manualSubstring)){
		    compare = true;
		}
		return compare;
	}
	
    public static void main(String[] args){
	    //Initialize Scanner Class
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String text = sc.next();
		System.out.println("Enter start index ");
		int start = sc.nextInt();
		System.out.println("Enter end index ");
		int end = sc.nextInt();
		
		//Creating built-in substring using substring() method
	    String builtInSubstring = text.substring(start, end);
		//Access createManualSubString method
		String manualSubstring = createManualSubString(text, start, end);
		
		System.out.println("Manually created substring is : "+ manualSubstring);
		System.out.println("Built-In created substring is : "+ builtInSubstring);
		
		boolean hk = compareTwoSubstrings(builtInSubstring, manualSubstring);
		if(hk == true){
		    System.out.println("Both substrings are same!");
		}else{
		    System.out.println("Substrings are not same!");
		}
	}
}