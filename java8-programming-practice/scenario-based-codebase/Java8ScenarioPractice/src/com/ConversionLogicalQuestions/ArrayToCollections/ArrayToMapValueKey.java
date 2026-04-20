package com.ConversionLogicalQuestions.ArrayToCollections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToMapValueKey {

    public static void main(String[] args) {

        String[] arr = {"A", "B", "C"};

        Map<String, Integer> map = Stream.of(arr)
                .collect(Collectors.toMap(
                        value -> value,
                        value -> value.length()
                ));

        System.out.println(map);
    }
}
