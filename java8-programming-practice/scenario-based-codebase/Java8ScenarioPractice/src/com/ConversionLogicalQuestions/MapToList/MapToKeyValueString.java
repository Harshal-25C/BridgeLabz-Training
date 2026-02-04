package com.ConversionLogicalQuestions.MapToList;

import java.util.*;
import java.util.stream.Collectors;

public class MapToKeyValueString {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);

        List<String> result = map.entrySet()
                .stream()
                .map(e -> e.getKey() + "=" + e.getValue())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
