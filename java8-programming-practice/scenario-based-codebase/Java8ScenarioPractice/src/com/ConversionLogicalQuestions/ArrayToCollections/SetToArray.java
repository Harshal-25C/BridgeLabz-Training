package com.ConversionLogicalQuestions.ArrayToCollections;

import java.util.*;

public class SetToArray {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30));

        Integer[] array = set.toArray(new Integer[0]);

        System.out.println(Arrays.toString(array));
    }
}
