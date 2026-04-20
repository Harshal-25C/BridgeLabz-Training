package com.StreamLogicalQuestions;

import java.util.stream.*;

public class KeepOnlyAlphabets {
	public static void main(String[] args) {
		String str = "java8stream2025".toLowerCase();
		
		String newstr = str.chars()
				.filter(ch -> Character.isLetter(ch))
				.mapToObj(ch -> String.valueOf((char) ch))
				.collect(Collectors.joining());
		System.out.println(newstr);
	}
}
