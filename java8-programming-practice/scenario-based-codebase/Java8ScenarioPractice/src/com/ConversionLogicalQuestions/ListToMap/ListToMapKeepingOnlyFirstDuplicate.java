package com.ConversionLogicalQuestions.ListToMap;

import java.util.*;
import java.util.stream.*;

public class ListToMapKeepingOnlyFirstDuplicate {
	public static void main(String[] args) {
		List<String> list = List.of("Java", "Java","Spring", "Spring", "boot");
		
		Map<String, Integer> map = list.stream()
				
				.collect(Collectors.toMap(
						c -> c,
						String::length,
						(a, b)->a));
		
		System.out.println(map);
	}
}