package com.StreamLogicalQuestions;

import java.util.Map;
import java.util.stream.Collectors;

public class CountEachCharacterExceptSpaces {
	public static void main(String[] args) {
		String str = "java stream";
		
		Map<Character, Long> newStr = str.chars()
				.mapToObj(c -> (char)c)
				.filter(c -> Character.isLetter(c))
				.collect(Collectors.groupingBy(c -> c,
						Collectors.counting()));
		
		System.out.println(newStr);
	}
}
