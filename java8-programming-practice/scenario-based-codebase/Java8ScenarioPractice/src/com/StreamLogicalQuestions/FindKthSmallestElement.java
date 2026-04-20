package com.StreamLogicalQuestions;

import java.util.*;
import java.util.stream.*;

public class FindKthSmallestElement {
	public static void main(String[] args) {
		List<Integer> list = List.of(9,1,5,3,7);
		int k=2;
		
		int newlist = list.stream().sorted().skip(k-1).findFirst().get();
		
		System.out.println(newlist);
	}
}
