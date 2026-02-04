package com.ConversionLogicalQuestions.ListToSet;

import java.util.*;
import java.util.stream.Collectors;

public class ListToLinkedHashSet {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("A", "B", "A", "C", "B");

        Set<String> linkedHashSet = list.stream()
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(linkedHashSet);
    }
}
