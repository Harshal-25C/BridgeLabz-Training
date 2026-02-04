package com.ConversionLogicalQuestions.ListToMap;

import java.util.*;
import java.util.stream.*;

public class ListOfStringsToMap {
	public static void main(String[] args) {
		List<String> list = List.of("Java", "Spring", "boot");
		
		Map<String, Integer> map = list.stream()
				.collect(Collectors.toMap(
						c -> c,
						c -> c.length()));
		
		System.out.println(map);
	}
}
