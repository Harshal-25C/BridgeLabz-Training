package com.ConversionLogicalQuestions.ListToMap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListOfWordsToMap {
	public static void main(String[] args) {
		List<String> list = List.of("Java", "Spring", "Java", "Boot", "boot");
		
		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(c -> c,
						Collectors.counting()));
		
		System.out.println(map);
	}
}
