package com.ConversionLogicalQuestions.MapToList;

import java.util.*;
import java.util.stream.Collectors;

public class MapFilterByValue {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 35);
        map.put("C", 60);

        int N = 30;

        List<Map.Entry<String, Integer>> filtered =
                map.entrySet()
                   .stream()
                   .filter(e -> e.getValue() > N)
                   .collect(Collectors.toList());

        System.out.println(filtered);
    }
}
