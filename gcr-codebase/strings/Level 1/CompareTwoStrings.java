//Import java util package to access Scanner class and String built-in methods
import java.util.*;

public class CompareTwoStrings{
    //Write method checkTwoStringsSameOrNot to compare both strings
    public static boolean checkTwoStringsSameOrNot(String s1, String s2){
	    boolean isEqual = false;
		
		if(s1.equals(s2)){
		    isEqual = true;
		}
		return isEqual;
	}
    public static void main(String[] args){
	    //Initialize Scanner Class
	    Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st String: ");
		String s1 = sc.next();
		System.out.println("Enter 2st String: ");
		String s2 = sc.next();
		
		//Access checkTwoStringsSameOrNot method
		boolean hk = checkTwoStringsSameOrNot(s1, s2);
		
		if(hk == true){
		    System.out.println("Both Strings are Same!");
		}else{
		    System.out.println("Strings are not same");
		}
	}
}