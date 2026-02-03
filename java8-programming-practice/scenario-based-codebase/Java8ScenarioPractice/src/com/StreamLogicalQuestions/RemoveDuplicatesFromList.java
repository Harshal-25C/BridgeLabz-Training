package com.StreamLogicalQuestions;

import java.util.*;
import java.util.stream.*;

public class RemoveDuplicatesFromList {
	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,2,3,4,4,5);
		
		List<Integer> newlist = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(newlist);
	}
}
