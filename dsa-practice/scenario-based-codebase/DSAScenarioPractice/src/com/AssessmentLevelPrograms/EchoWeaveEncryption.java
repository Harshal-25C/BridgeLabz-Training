package com.AssessmentLevelPrograms;
import java.util.*;

public class EchoWeaveEncryption {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str = sc.nextLine();
		
		String regex = "^[A-Za-z]+$";
		if(!str.matches(regex)) {
			System.out.println(str+" Invalid input");
			System.exit(0);
		}
		
		
		str = str.toUpperCase();
		
		LinkedHashMap<Character, Integer> mp = new LinkedHashMap<>();
		for(int i=0; i<str.length(); i++) {
			mp.put(str.charAt(i), mp.getOrDefault(str.charAt(i), 0)+1);
		}
		
		StringBuilder evenStr = new StringBuilder();
		StringBuilder oddStr = new StringBuilder();
		int singleCount=0;
		
	    for(Map.Entry<Character, Integer> hk : mp.entrySet()) {
	    	int value = hk.getValue();
	    	char key = hk.getKey();
	    	
	    	if(value == 1) {
	    		singleCount++;
	    	}
	    	
	    	if(value%2 == 0) {
	    		evenStr.append(key);
	    	}else {
	    		oddStr.append(key);
	    	}
	    }
	    
	    String newStr = evenStr.toString();
	    newStr = newStr.concat(oddStr.toString());
	    
	    String result =newStr;
	    for(Map.Entry<Character, Integer> hk : mp.entrySet()) {
	    	int count = hk.getValue();
	    	for(int i=1; i<count; i++) {
	    		result += hk.getKey();
	    	}
	    }
	    int middle=0;
	    middle= result.length()%2==0 ? result.length()/2 : (result.length()/2)+1;
	    
	    if(singleCount != 0) {
	    	result = result.substring(0, middle)+singleCount
		    		+result.substring(middle);
	    }else {
	    	result = result.substring(0, middle)
		    		+result.substring(middle);
	    }
	    
	    System.out.println(result);
	}
}
