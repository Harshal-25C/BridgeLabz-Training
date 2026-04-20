package com.ConversionLogicalQuestions.ArrayToCollections;

import java.util.*;

public class ListToArray {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "C");

        String[] array = list.toArray(new String[0]);

        System.out.println(Arrays.toString(array));
    }
}
