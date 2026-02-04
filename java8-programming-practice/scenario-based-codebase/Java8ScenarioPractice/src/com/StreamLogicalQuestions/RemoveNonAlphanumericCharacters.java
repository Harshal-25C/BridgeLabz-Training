package com.StreamLogicalQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNonAlphanumericCharacters {
	public static void main(String[] args) {
		String str = "ja@va#8!!".toLowerCase();
		
		String newstr = str.chars()
				.filter(ch -> Character.isLetterOrDigit(ch))
				.mapToObj(ch -> String.valueOf((char) ch))
				.collect(Collectors.joining());
		System.out.println(newstr);
	}
}
