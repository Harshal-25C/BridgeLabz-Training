package com.ConversionLogicalQuestions.ArrayToCollections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToSet {

    public static void main(String[] args) {

        Integer[] arr = {1, 2, 2, 3, 4};

        Set<Integer> set = Stream.of(arr)
                .collect(Collectors.toSet());

        System.out.println(set);
    }
}

