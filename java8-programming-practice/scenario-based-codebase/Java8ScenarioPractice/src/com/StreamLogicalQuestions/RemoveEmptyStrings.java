package com.StreamLogicalQuestions;
import java.util.*;
import java.util.stream.*;

public class RemoveEmptyStrings {
	public static void main(String[] args) {
		List<String> list = List.of("java","","spring","","boot");
		
		List<String> newlist = list.stream().filter(e -> !e.isEmpty()).collect(Collectors.toList());
		
		System.out.println(newlist);
	}
}
