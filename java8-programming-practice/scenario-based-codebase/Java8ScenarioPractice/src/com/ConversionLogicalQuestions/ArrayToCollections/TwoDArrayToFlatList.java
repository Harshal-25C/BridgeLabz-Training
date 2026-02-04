package com.ConversionLogicalQuestions.ArrayToCollections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoDArrayToFlatList {

    public static void main(String[] args) {

        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};

        List<Integer> list = Stream.of(arr)
                .flatMap(a -> Arrays.stream(a).boxed())
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
