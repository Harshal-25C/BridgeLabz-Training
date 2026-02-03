package com.StreamLogicalQuestions;

import java.util.*;
import java.util.stream.*;

public class Top3HighestNumbers {
	public static void main(String[] args) {
		List<Integer> list = List.of(10,90,30,70,50);
		
		List<Integer> newlist = list.stream().sorted(Comparator.reverseOrder())
				.limit(3).collect(Collectors.toList());
		
		System.out.println(newlist);
	}
}
