package com.ConversionLogicalQuestions.MapToList;

import java.util.*;
import java.util.stream.*;

//Convert Map values to List
public class MapValuesToList {
	
	public static void main(String[] args) {
		Map<String, Integer> map = Map.of(
			"Java", 101,
			"Cpp", 102,
			"Koltin", 103,
			"Ruby", 104
		);
		
		List<Integer> list = map.values().stream().collect(Collectors.toList());
		
		System.out.println(list);
	}
}