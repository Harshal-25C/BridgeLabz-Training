package com.StreamLogicalQuestions;
import java.util.*;
import java.util.stream.*;

public class JoinStringsWithComma {
	public static void main(String[] args) {
		List<String> list = List.of("Java","Spring","Boot");
		
		String newlist = list.stream()
				.collect(Collectors.joining(","));
		
		System.out.println(newlist);
	}
}
