//write a java program to check whether the user enter string has more than four vowels characters or not

import java.util.*;

public class StringVowels{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str = sc.next();
		
		int count = 0;
		for(int i=0; i<str.length(); i++){
		    if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' ||
			str.charAt(i) == 'A'|| str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U'){
			    count++;
			}
		}
		
		if(count >= 4){
		    System.out.println("Yes! 4 vowels are present in string");
		}else{
		    System.out.println("No! 4 vowels doesn't present in String");
		}
	}
}