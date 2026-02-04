package com.ConversionLogicalQuestions.ListToMap;

import java.util.*;
import java.util.stream.*;

public class ListToMapNHandleDuplicateKeys {
	public static void main(String[] args) {
		List<String> list = List.of("Java", "Java","Spring", "Spring", "boot");
		
		Map<String, Integer> map = list.stream()
				.distinct()
				.collect(Collectors.toMap(
						c -> c,
						c -> c.length()));
		
		System.out.println(map);
	}
}
