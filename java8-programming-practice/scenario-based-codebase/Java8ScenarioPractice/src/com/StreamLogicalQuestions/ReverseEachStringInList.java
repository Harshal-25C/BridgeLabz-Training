package com.StreamLogicalQuestions;

import java.util.*;
import java.util.stream.*;

public class ReverseEachStringInList {
	public static void main(String[] args) {
		List<String> list = List.of("java","api");
		
		List<String> newlist = list.stream()
				.map(e -> new StringBuilder(e).reverse().toString())
				.collect(Collectors.toList());
		
		System.out.println(newlist);
	}
}
