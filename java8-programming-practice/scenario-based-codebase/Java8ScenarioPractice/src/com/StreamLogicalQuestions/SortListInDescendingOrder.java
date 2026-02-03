package com.StreamLogicalQuestions;

import java.util.*;
import java.util.stream.*;

public class SortListInDescendingOrder {
	public static void main(String[] args) {
		List<Integer> list = List.of(5,1,9,3);
		
		List<Integer> newlist = list.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println(newlist);
	}
}
