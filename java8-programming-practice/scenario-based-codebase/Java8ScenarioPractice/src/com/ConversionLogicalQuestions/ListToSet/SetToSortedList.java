package com.ConversionLogicalQuestions.ListToSet;

import java.util.*;
import java.util.stream.Collectors;

public class SetToSortedList {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(9, 3, 7, 1));

        List<Integer> sortedList = set.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }
}
