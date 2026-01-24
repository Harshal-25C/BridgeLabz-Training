package com.regex.ExtractionRegexProblems;
import java.util.regex.*;

/* \b → word boundary

   [A-Z] → first letter capital

   [a-z]* → remaining lowercase letters          
  
*/

public class ExtractCapitalWords {
    public static void main(String[] args) {

        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        //Regex for capitalized words
        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
