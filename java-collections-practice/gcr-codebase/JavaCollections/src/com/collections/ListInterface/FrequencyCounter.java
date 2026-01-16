package com.collections.ListInterface;
import java.util.*;

public class FrequencyCounter {

    public static Map<String, Integer> countFrequency(List<String> list) {

        Map<String, Integer> map = new HashMap<>();

        for(String item:list) {
            map.put(item, map.getOrDefault(item, 0)+1);
        }
        return map;
    }

    public static void main(String[] args) {

        List<String> fruits = List.of("apple", "banana", "apple", "orange");

        System.out.println(countFrequency(fruits));
    }
}
