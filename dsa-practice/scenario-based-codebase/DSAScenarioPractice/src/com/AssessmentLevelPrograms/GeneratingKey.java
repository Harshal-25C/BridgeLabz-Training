package com.AssessmentLevelPrograms;
import java.util.*;

public class GeneratingKey {
	public static String CleanseAndInvert(String str) {
		str.toLowerCase();
		String newStr = "";
		
		for(int i=0; i<str.length(); i++){
            int ch = (int)str.charAt(i);
            
            if(ch%2 != 0) {
            	newStr += str.charAt(i);
            }
        }
		str = "";
		for(int i=newStr.length()-1; i>=0; i--) {
			str += newStr.charAt(i);
		}
		
		newStr = "";
		for(int i=0; i<str.length(); i++){
            if(i%2 == 0) {
            	newStr +=Character.toUpperCase(str.charAt(i));
            }else {
            	newStr += str.charAt(i);
            }
        }
		return newStr;
	}
	
	public static boolean checkValidInput(String str) {
		if(str.length() < 6) {
			return false;
		}
		
		boolean isValid = false;
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				isValid = true;
			}else {
				return false;
			}
		}
		return isValid;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string: ");
		String str = sc.next();
		
		//GeneratingKey sk = new GeneratingKey();
	
		
		if(checkValidInput(str)) {
			System.out.println( CleanseAndInvert(str));
		}else {
			System.out.println("Invalid");
		}
	}
}