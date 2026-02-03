package com.StreamLogicalQuestions;

import java.util.*;

public class EvenNumbersFromList {
	public static void main(String[] args) {
		List<Integer> list = List.of(2, 5, 7, 8, 10, 13);
		
		List<Integer> newList = list.stream().filter(e -> e%2==0).toList();
		
		System.out.println(newList);
	}
}
