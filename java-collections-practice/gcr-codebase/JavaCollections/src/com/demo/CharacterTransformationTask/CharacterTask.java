package com.demo.CharacterTransformationTask;
import java.util.*;

public class CharacterTask {
	public static String encodedString(String str) {
		if(str.length() <= 4) {
            return "The String "+str+ " has minimum length";
        }

        if(str.contains(" ")) {
            return "String should not contain space";
        }

        int length = str.length();
        StringBuilder hk = new StringBuilder();
        
        for(int i=0; i<str.length(); i++) {
            char ch=str.charAt(i);
            char encodedChar = (char) (ch-length);
            hk.append(encodedChar);
        }

        return "Encoded Message: " + hk.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String newStr = encodedString(str);
		System.out.println(newStr);
	}
}

