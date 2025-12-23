//Import java util package to access Scanner class
import java.util.*;

public class PalindromeString{
	//Create method to check string is palindrome or not
    public static boolean isPalindromeIterative(String txt){
        int start=0;
        int end = txt.length()-1;

        while(start<end){
            if(txt.charAt(start) != txt.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
		//Initialize Scanner Class
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String txt = sc.next();
		
		//Access method isPalindromeIterative
		boolean hk = isPalindromeIterative(txt);
		
		if(hk == true){
		    System.out.println("String is palindrome!");
		}else{
		    System.out.println("String is not Palindrome!");
		}
	}
}