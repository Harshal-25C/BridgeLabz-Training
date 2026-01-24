package com.regex.BasicRegexProblems;

// Starts with #
// Followed by exactly 6 hexadecimal characters
// Hex characters: 0-9, A-F, a-f

// Hex color regex validates CSS-compatible color codes.

public class HexColorValidation {
    public static void main(String[] args) {
        String[] colors = {"#FFA500", "#ff4500", "#123"};

        String regex = "^#[0-9A-Fa-f]{6}$";
        /*  # → required starting symbol
            [0-9A-Fa-f]{6} → exactly 6 hexadecimal characters */

        for(String color:colors) {
            if(color.matches(regex)) {
                System.out.println(color + " → Valid");
            }else {
                System.out.println(color + " → Invalid");
            }
        }
    }
}
