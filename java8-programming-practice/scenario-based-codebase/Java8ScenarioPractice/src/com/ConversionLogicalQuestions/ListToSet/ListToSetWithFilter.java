package com.ConversionLogicalQuestions.ListToSet;

import java.util.*;
import java.util.stream.Collectors;

public class ListToSetWithFilter {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5, 10, 15, 20, 25);

        Set<Integer> filteredSet = list.stream()
                .filter(n -> n > 15)
                .collect(Collectors.toSet());

        System.out.println(filteredSet);
    }
}
