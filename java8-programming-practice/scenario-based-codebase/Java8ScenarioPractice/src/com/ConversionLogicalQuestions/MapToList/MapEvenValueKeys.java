package com.ConversionLogicalQuestions.MapToList;

import java.util.*;
import java.util.stream.Collectors;

public class MapEvenValueKeys {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 15);
        map.put("C", 22);

        List<String> keys =
                map.entrySet()
                   .stream()
                   .filter(e -> e.getValue() % 2 == 0)
                   .map(Map.Entry::getKey)
                   .collect(Collectors.toList());

        System.out.println(keys);
    }
}
