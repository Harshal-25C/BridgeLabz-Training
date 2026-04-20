package com.StreamLogicalQuestions;

import java.util.*;
import java.util.stream.*;

public class CountOccurrencesOfEachWord {
	public static void main(String[] args) {
		String str = "java is java and java is fast";
		
		Map<String, Long> newlist = Arrays.stream(str.trim().split(" "))
				.collect(Collectors.groupingBy(s -> s, 
						Collectors.counting()));
		
		System.out.println(newlist);
	}
}
