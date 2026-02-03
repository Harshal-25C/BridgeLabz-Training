package com.StreamLogicalQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class FindWordsLengthInString {
	public static void main(String[] args) {
		List<String> list = List.of("cat","elephant","dog");
		
		List<Integer> newlist = list.stream()
				.map(String::length)
				.collect(Collectors.toList());
		
		System.out.println(newlist);
	}
}
