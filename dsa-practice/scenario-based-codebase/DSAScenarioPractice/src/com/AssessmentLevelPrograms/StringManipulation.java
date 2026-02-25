package com.AssessmentLevelPrograms;
import java.util.*;

public class StringManipulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		
		String str = sc.next().toLowerCase();
		
		String x = str.substring(0, 1);
		StringBuilder sb = new StringBuilder(str);
		sb = sb.reverse();
		
		System.out.println(sb.substring(0, sb.length()/2) + x +sb.substring(sb.length()/2, sb.length()));
		// Or
//		int len = sb.length();
//	    int insertPos = len/2;
//	    sb.insert(insertPos, "h");
//	    System.out.print(sb);
	}
	
}

/* Given a string S, create a new string using the following transformation:

- Take the first character of S — call it x.
- Reverse the entire string S — call it rev.
- Insert the character x exactly in the middle of rev:
- If the length of rev is even, insert before the middle.
- If odd, insert exactly at the middle index.
- Return the resulting string.

 */