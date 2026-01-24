package com.regex.AdvancedRegexProblems;
import java.util.regex.*;

public class ExtractProgrammingLanguages {
    public static void main(String[] args) {

        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        //Regex to match specific programming language names
        String regex = "\\b(Java|Python|JavaScript|Go)\\b";

        //Compile the pattern
        Pattern pattern = Pattern.compile(regex);

        //Match pattern against the text
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
