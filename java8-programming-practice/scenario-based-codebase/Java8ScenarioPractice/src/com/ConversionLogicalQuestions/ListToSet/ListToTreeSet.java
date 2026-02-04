package com.ConversionLogicalQuestions.ListToSet;

import java.util.*;
import java.util.stream.Collectors;

public class ListToTreeSet {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 3, 1, 4, 2, 2);

        Set<Integer> treeSet = list.stream()
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(treeSet);
    }
}
