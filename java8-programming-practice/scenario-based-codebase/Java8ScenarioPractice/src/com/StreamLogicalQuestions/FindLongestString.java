package com.StreamLogicalQuestions;

import java.util.*;
import java.util.stream.*;

public class FindLongestString {
	public static void main(String[] args) {
		List<String> list = List.of("java","microservices","api");
		
		String newlist = list.stream()
				.max(Comparator.comparing(String::length)).get();
		
		System.out.println(newlist);
	}
}
