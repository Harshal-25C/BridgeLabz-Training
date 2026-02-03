package com.StreamLogicalQuestions;
import java.util.*;
import java.util.stream.*;

public class SortMapByValue {
	public static void main(String[] args) {
		Map<String, Integer> list = Map.of(
				"A", 1,
				"B", 2,
				"C", 3
		);
		
		list.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach(System.out::println);
		
	}
}
