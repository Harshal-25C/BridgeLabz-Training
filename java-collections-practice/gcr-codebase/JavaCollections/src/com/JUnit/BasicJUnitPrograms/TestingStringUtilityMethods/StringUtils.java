package com.JUnit.BasicJUnitPrograms.TestingStringUtilityMethods;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtils {

    //Reverse a string
    public String reverse(String str) {
        if(str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    //Check palindrome
    public boolean isPalindrome(String str) {
        if (str == null) return false;
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed);
    }

    //Convert to uppercase
    public String toUpperCase(String str) {
        if (str == null) return null;
        return str.toUpperCase();
    }
}
