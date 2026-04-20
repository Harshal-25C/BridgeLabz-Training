package com.StreamLogicalQuestions;

import java.util.*;
import java.util.stream.*;

public class ListIntegerToListString {
	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3);
		
		List<String> newlist = list.stream()
				.map(c -> c + "").toList();
		
		System.out.println(newlist);
	}
}
