package com.AssessmentLevelPrograms.M1_mock;

/*Your task is to perform the following operations on the string in the given order and print the final result. 
 * 
 * The operations are as follows: 
 * 
 * 1. Reverse the string 
 * 2. Replace all vowels with the next vowel in sequence as follows (one-li-ao-uu-a) 
 * 3. The replacement must be case-insensitive, and the original case must be preserved 
 * 4. Remove all duplicate characters from the string and keep only the first occurrence of each character
 * 5. Rotate the resulting string to the right by K positions. Print the final transformed string after applying all operations.
 * 
 */
import java.util.*;

public class StringOperations {

    static String process(String str, int k) {

        // 1. Reverse the string
        String reversed = "";
        for(int i=str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // 2. Replace vowels with next vowel
        String changed = "";
        for(int i=0; i<reversed.length(); i++) {

            char ch = reversed.charAt(i);
            char lower = Character.toLowerCase(ch);

            if (lower == 'a') ch = getChar(ch, 'e');
            else if (lower == 'e') ch = getChar(ch, 'i');
            else if (lower == 'i') ch = getChar(ch, 'o');
            else if (lower == 'o') ch = getChar(ch, 'u');
            else if (lower == 'u') ch = getChar(ch, 'a');

            changed += ch;
        }

        // 3. Remove duplicate characters (keep first)
        String unique = "";
        for(int i=0; i<changed.length(); i++) {

            char ch = changed.charAt(i);

            if(unique.indexOf(ch) == -1) {
                unique += ch;
            }
        }

        // 4. Right rotate by k positions
        int n = unique.length();

        if(n > 0) {
            k = k%n;

            String part1 = unique.substring(n-k);
            String part2 = unique.substring(0, n-k);

            unique = part1+part2;
        }

        return unique;
    }

    private static char getChar(char original, char newChar) {

        if(Character.isUpperCase(original))
            return Character.toUpperCase(newChar);

        return newChar;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases: ");
        int t = sc.nextInt();

        while(t-- > 0) {
        	System.out.println("Enter any String: ");
            String str = sc.next();
            int k = sc.nextInt();

            System.out.println(process(str, k));
        }

        sc.close();
    }
}