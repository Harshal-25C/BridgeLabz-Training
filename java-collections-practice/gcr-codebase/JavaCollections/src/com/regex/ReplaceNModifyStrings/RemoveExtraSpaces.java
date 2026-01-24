package com.regex.ReplaceNModifyStrings;

// Explanation: 
// \s → matches any whitespace (space, tab, newline)
// + → one or more occurrences

public class RemoveExtraSpaces {
    public static void main(String[] args) {

        String input = "This   is    an   example   with   multiple    spaces.";

        // Replace multiple whitespace characters with a single space
        String output = input.replaceAll("\\s+", " ");

        System.out.println(output);
    }
}
