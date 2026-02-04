package com.ConversionLogicalQuestions.ListToSet;

import java.util.*;

public class SetToList {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>(Arrays.asList("Java", "Python", "C++"));

        List<String> list = new ArrayList<>(set);

        System.out.println(list);
    }
}
