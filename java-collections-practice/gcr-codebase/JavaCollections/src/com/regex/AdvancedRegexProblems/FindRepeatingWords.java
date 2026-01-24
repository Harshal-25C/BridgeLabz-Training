package com.regex.AdvancedRegexProblems;
import java.util.regex.*;

public class FindRepeatingWords {
    public static void main(String[] args) {

        String text = "This is is a repeated repeated word test.";

        // Regex to find consecutive repeating words
        String regex = "\\b(\\w+)\\s+\\1\\b";

        // Compile pattern with CASE_INSENSITIVE flag
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(text);

        // Extract only the repeated word (group 1)
        while(matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
