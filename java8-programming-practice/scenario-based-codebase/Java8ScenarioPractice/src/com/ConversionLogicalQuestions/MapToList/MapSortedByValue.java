package com.ConversionLogicalQuestions.MapToList;

import java.util.*;
import java.util.stream.Collectors;

public class MapSortedByValue {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 50);
        map.put("B", 10);
        map.put("C", 30);

        List<Map.Entry<String, Integer>> sortedByValue =
                map.entrySet()
                   .stream()
                   .sorted(Map.Entry.comparingByValue())
                   .collect(Collectors.toList());

        System.out.println(sortedByValue);
    }
}
