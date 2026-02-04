package com.StreamLogicalQuestions;

import java.util.stream.Collectors;

public class KeepOnlyDigits {
	public static void main(String[] args) {
		String str = "orderId=AB123XZ9";
		
		String newstr = str.chars()
				.filter(ch -> Character.isDigit(ch))
				.mapToObj(ch -> String.valueOf((char) ch))
				.collect(Collectors.joining());
		System.out.println(newstr);
	}
}
