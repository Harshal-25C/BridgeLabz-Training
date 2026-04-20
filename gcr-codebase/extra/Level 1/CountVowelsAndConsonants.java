//Import java util package to access Scanner class
import java.util.*;

public class CountVowelsAndConsonants{
	//Check vowels and consonants
    public static int checkVowelsAndConsonants(String txt){
	    int vowels=0;
	    for(int i=0; i<txt.length(); i++){
			//Check a, e, i, o, u in string
			if(txt.charAt(i) == 'a' || txt.charAt(i) == 'e' || txt.charAt(i) == 'i' || txt.charAt(i) == 'o' || txt.charAt(i) == 'u'||
			    txt.charAt(i) == 'A' || txt.charAt(i) == 'E' || txt.charAt(i) == 'I' || txt.charAt(i) == 'O' || txt.charAt(i) == 'U'){
		        vowels++;
		    }
		}
		return vowels;
	}
    public static void main(String[] args){
		//Initialize Scanner Class
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String : ");
		String txt = sc.next();
		
		int n = txt.length();
		
		//Access method checkVowelsAndConsonants
		int hk = checkVowelsAndConsonants(txt);
		//To find consonants 
		int consonants = n-hk;
		
		System.out.println("In String "+txt+" vowels is: "+hk);
		System.out.println("In String "+txt+" consonants is: "+consonants);
	}
}