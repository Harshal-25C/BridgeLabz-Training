package com.StreamLogicalQuestions;

import java.util.*;

public class CountStringStartsWithA {
	public static void main(String[] args) {
		List<String> list = List.of("apple","banana","ant","car");
		
		long newlist = list.stream().filter(e -> e.startsWith("a")).count();
		
		System.out.println(newlist);
	}
}
