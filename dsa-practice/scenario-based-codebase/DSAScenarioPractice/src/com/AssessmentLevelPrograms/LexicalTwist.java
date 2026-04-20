package com.AssessmentLevelPrograms;
import java.util.*;

public class LexicalTwist {
	public static void reversedVersion(String word2) {
		word2.toLowerCase();
		
		for(int i=0; i<word2.length(); i++) {
			char ch = word2.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				word2 = word2.replace(ch, '@');
			}
		}
		System.out.println(word2);
	}
	
	public static void notReversedVersion(String word1, String word2) {
		word1 = word1.concat(word2);
		word1 = word1.toUpperCase();
		
		int cntVowel = 0;
        int cntConsonant = 0;

        Set<Character> vowelsSet = new LinkedHashSet<>();
        Set<Character> consonantsSet = new LinkedHashSet<>();
        
        for(char ch : word1.toCharArray()) {

            if(ch >= 'A' && ch <= 'Z') {
            	
                if("AEIOU".indexOf(ch) != -1) {
                    cntVowel++;
                    vowelsSet.add(ch);
                }else {
                    cntConsonant++;
                    consonantsSet.add(ch);
                }
            }
        }

        if(cntVowel > cntConsonant) {
        	int count = 0;
            for(char ch:vowelsSet) {
                System.out.print(ch);
                count++;
                if(count == 2) break;
            }
        } 
        else if(cntConsonant > cntVowel) {
        	int count = 0;
            for(char ch:consonantsSet) {
                System.out.print(ch);
                count++;
                if(count == 2) break;
            }
        } 
        else{
            System.out.println("Vowels and consonants are equal");
        }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Word: ");
		String word1 = sc.next();
		System.out.println("Enter Second Word: ");
		String word2 = sc.next();
		
		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();
        
		if(word1.contains(" ") || word2.contains(" ")) {
			System.out.println("Invalid String! Enter only one word");
		}
		
		StringBuilder str = new StringBuilder(word2);
		str.reverse();
		
		String newStr = new String(str);
		
		if(word1.equals(newStr)) {
			reversedVersion(word2);
		}else {
			notReversedVersion(word1, word2);
		}
	}
}
