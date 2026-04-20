package com.regex.ReplaceNModifyStrings;

// Explanation:
//   \b → word boundary (ensures whole-word matching)
//   (damn|stupid) → bad words list using OR (|)

public class CensorBadWords {
    public static void main(String[] args) {

        String text = "This is a damn bad example with some stupid words.";

        //List of bad words (can be extended)
        String regex = "\\b(damn|stupid)\\b";

        //Replace bad words with ****
        String censoredText = text.replaceAll(regex, "****");

        System.out.println(censoredText);
    }
}
