package com.StreamLogicalQuestions;

import java.util.*;
import java.util.stream.*;

public class FlattenListOfLists {
	public static void main(String[] args) {
		List<List<Integer>> list = List.of(
				List.of(1, 2),
				List.of(3, 4),
				List.of(5)
		);
		
		List<Integer> newlist = list.stream()
				.flatMap(List::stream).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(newlist);
	}
}
