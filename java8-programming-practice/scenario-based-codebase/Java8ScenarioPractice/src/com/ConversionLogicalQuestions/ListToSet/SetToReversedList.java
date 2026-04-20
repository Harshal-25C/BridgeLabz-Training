package com.ConversionLogicalQuestions.ListToSet;

import java.util.*;
import java.util.stream.Collectors;

public class SetToReversedList {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4));

        List<Integer> reversedList = set.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(reversedList);
    }
}
