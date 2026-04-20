package com.StreamLogicalQuestions;

import java.util.*;

public class CountNumberOfWordsInSentence {
	public static void main(String[] args) {
		String str = "Java is very powerful";
		
		// 1st way
		long count = 1;
		count += str.chars().filter(e -> " ".indexOf(e) != -1).count();
		
		// 2nd way
		long cnt = Arrays.stream(str.split(" ")).count();
		
		System.out.println(count);
		System.out.println(cnt);
	}
}