package com.StreamLogicalQuestions;

import java.util.*;
import java.util.stream.*;

public class GroupStringsByLength {
	public static void main(String[] args) {
		List<String> list = List.of("a","bb","ccc","dd");
		
		Map<Integer, List<String>> newlist = list.stream()
				.collect(Collectors.groupingBy(String::length));
		
		System.out.println(newlist);
	}
}
