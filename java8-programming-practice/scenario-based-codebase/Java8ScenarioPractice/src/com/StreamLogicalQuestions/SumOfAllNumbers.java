package com.StreamLogicalQuestions;
import java.util.*;
import java.util.stream.*;
public class SumOfAllNumbers {
	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5);
		
		int newlist = list.stream().reduce(0, (a,b) -> a+b);
		
		System.out.println(newlist);
	}
}
