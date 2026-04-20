package com.regex.ExtractionRegexProblems;
import java.util.regex.*;

/* Explanation:

[A-Za-z0-9+_.-]+ → username part
@ → mandatory symbol
[A-Za-z0-9.-]+ → domain name

*/
public class ExtractEmails {
    public static void main(String[] args) {

        String text = "Contact us at support@example.com and info@company.org";

        // Regex for email matching
        String regex = "[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+";

        // Compile regex
        Pattern pattern = Pattern.compile(regex);

        // Match regex with input text
        Matcher matcher = pattern.matcher(text);

        // Find all matches
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
