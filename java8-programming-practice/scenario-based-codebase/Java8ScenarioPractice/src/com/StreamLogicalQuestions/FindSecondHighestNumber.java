package com.StreamLogicalQuestions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondHighestNumber {
	public static void main(String[] args) {
		List<Integer> list = List.of(10,40,30,20);
		
		int newlist = list.stream()
				.sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().get();
		
		System.out.println(newlist);
	}
}
