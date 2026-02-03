package com.StreamLogicalQuestions;

import java.util.*;

public class ConvertListOfStringToUppercase {
	public static void main(String[] args) {
		List<String> list = List.of("java","spring","boot");
		
		List<String> newlist = list.stream().map(e -> e.toUpperCase()).toList();
		
		System.out.println(newlist);
	}
}
