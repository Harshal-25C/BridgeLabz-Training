package com.ConversionLogicalQuestions.MapToList;
//Convert Map keys to List

import java.util.*;
import java.util.stream.*;

public class MapKeysToList {
	public static void main(String[] args) {
		Map<String, Integer> map = Map.of(
			"Java", 101,
			"Cpp", 102,
			"Koltin", 103,
			"Ruby", 104
		);
		
		List<String> list = map.keySet().stream().collect(Collectors.toList());
		
		System.out.println(list);
	}
}
