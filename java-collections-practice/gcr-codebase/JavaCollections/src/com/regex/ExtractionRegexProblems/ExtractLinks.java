package com.regex.ExtractionRegexProblems;
import java.util.regex.*;

/*💡 Explanation:
 * 
 *     https?  →  matches http or https
 *     ://  →  protocol separator
 *     [A-Za-z0-9.-]+  →  domain name           */

public class ExtractLinks {
    public static void main(String[] args) {

        String text = "Visit https://www.google.com and http://example.org for more info.";

        //Regex for extracting URLs
        String regex = "https?://[A-Za-z0-9.-]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        //Loop to extract all links
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
