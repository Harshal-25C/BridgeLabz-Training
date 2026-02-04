package com.ConversionLogicalQuestions.ArrayToCollections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToListStream {

    public static void main(String[] args) {

        String[] arr = {"Java", "Python", "C++"};

        List<String> list = Stream.of(arr)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
