package com.ConversionLogicalQuestions.MapToList;

import java.util.*;
import java.util.stream.Collectors;

public class MapSortedByKey {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("B", 40);
        map.put("A", 10);
        map.put("C", 20);

        List<Map.Entry<String, Integer>> sortedByKey =
                map.entrySet()
                   .stream()
                   .sorted(Map.Entry.comparingByKey())
                   .collect(Collectors.toList());

        System.out.println(sortedByKey);
    }
}
