package com.ConversionLogicalQuestions.ListToMap;

import java.util.*;
import java.util.stream.*;

public class ListToMapWithIndexNKey {
	public static void main(String[] args) {
		List<String> list = List.of("Java", "Spring", "boot");
		
		Map<Integer, String> map =
				IntStream.range(0, list.size())
				.boxed()
				.collect(Collectors.toMap(
						i -> i,
						i -> list.get(i)));
		
		System.out.println(map);
	}
}
