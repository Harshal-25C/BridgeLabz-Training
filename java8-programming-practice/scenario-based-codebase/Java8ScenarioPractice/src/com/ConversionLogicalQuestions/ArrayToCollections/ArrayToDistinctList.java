package com.ConversionLogicalQuestions.ArrayToCollections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToDistinctList {

    public static void main(String[] args) {

        Integer[] arr = {1, 2, 2, 3, 3, 4};

        List<Integer> distinctList = Stream.of(arr)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(distinctList);
    }
}
