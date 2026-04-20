package com.ConversionLogicalQuestions.ListToSet;

import java.util.*;
import java.util.stream.Collectors;

public class ListToSet {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        Set<Integer> set = list.stream()
                .collect(Collectors.toSet());

        System.out.println(set);
    }
}
