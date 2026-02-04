package com.ConversionLogicalQuestions.ArrayToCollections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntArrayToList {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        List<Integer> list = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
