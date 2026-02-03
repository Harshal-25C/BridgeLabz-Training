package com.StreamLogicalQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		String str = "stress".toLowerCase();
		
		char ch = str.chars().mapToObj(c -> (char) c)
				.filter(c->str.indexOf(c) == str.lastIndexOf(c))
				.findFirst()
				.orElse(null);
		
		System.out.println(ch);
	}
}
