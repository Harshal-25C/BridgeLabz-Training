package com.StreamLogicalQuestions;

import java.util.*;


public class CountVowelsInString {
	public static void main(String[] args) {
		System.out.println("Enter any String: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		long count = str.toLowerCase()
				.chars().filter(e -> "aeiou".indexOf(e) != -1).count();
		
		System.out.println(count + " vowels present in "+str);
	}
}
