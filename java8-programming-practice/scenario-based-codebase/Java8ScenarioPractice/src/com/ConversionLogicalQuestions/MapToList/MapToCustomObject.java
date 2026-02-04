package com.ConversionLogicalQuestions.MapToList;

import java.util.*;
import java.util.stream.Collectors;

public class MapToCustomObject {

    static class Pair {
        String key;
        int value;

        Pair(String key, int value) {
            this.key = key;
            this.value = value;
        }

        public String toString() {
            return key + ":" + value;
        }
    }

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("X", 5);
        map.put("Y", 15);

        List<Pair> list = map.entrySet()
                .stream()
                .map(e -> new Pair(e.getKey(), e.getValue()))
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
