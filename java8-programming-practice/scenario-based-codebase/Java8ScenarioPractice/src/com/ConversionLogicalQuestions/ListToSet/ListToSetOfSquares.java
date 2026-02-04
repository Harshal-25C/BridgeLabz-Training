package com.ConversionLogicalQuestions.ListToSet;

import java.util.*;
import java.util.stream.Collectors;

public class ListToSetOfSquares {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4);

        Set<Integer> squares = list.stream()
                .map(n -> n * n)
                .collect(Collectors.toSet());

        System.out.println(squares);
    }
}
