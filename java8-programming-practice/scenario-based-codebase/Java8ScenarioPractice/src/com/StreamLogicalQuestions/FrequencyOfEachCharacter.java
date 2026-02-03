package com.StreamLogicalQuestions;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class FrequencyOfEachCharacter {
	public static void main(String[] args) {
		String list = "banana";
		
		Map<Character, Long> newlist = list.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c,
						Collectors.counting()));
		
		System.out.println(newlist);
	}
}
