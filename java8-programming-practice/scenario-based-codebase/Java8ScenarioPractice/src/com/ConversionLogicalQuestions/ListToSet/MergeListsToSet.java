package com.ConversionLogicalQuestions.ListToSet;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeListsToSet {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(3, 4, 5);

        Set<Integer> mergedSet = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toSet());

        System.out.println(mergedSet);
    }
}
