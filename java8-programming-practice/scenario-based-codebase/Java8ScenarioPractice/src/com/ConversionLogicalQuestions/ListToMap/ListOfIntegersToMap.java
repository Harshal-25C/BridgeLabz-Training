package com.ConversionLogicalQuestions.ListToMap;

import java.util.*;
import java.util.stream.Collectors;

public class ListOfIntegersToMap {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
		
		Map<Integer, Integer> map = list.stream()
				.collect(Collectors.toMap(
						c -> c,
						c -> c*c));
		
		System.out.println(map);
	}
}
