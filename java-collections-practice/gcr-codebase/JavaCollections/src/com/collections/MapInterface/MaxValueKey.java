package com.collections.MapInterface;
import java.util.*;

public class MaxValueKey {

    public static String findMaxKey(Map<String, Integer> map) {

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxValue) {
                maxValue=entry.getValue();
                maxKey=entry.getKey();
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {

        Map<String, Integer> map = Map.of(
                "A", 10,
                "B", 20,
                "C", 15
        );

        System.out.println(findMaxKey(map));
    }
}
