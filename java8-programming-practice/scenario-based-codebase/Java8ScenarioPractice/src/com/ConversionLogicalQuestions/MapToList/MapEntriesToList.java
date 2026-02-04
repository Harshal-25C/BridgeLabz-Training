package com.ConversionLogicalQuestions.MapToList;

import java.util.*;
import java.util.stream.*;

public class MapEntriesToList {
	
	public static void main(String[] args) {
		Map<String, Integer> map = Map.of(
			"Java", 101,
			"Cpp", 102,
			"Koltin", 103,
			"Ruby", 104
		);
		
		List<Map.Entry<String, Integer>> list = map.entrySet().stream().collect(Collectors.toList());
		
		System.out.println(list);
		
		list.forEach(e -> {
			System.out.print(e.getKey() +"="+e.getValue() +" ");
		});
	}
}