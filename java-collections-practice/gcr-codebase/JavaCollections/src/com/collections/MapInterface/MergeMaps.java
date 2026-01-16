package com.collections.MapInterface;
import java.util.*;

public class MergeMaps {

    public static Map<String, Integer> merge(
            Map<String, Integer> map1,
            Map<String, Integer> map2) {

        Map<String, Integer> result = new HashMap<>(map1);

        for(Map.Entry<String, Integer> entry:map2.entrySet()) {
            result.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return result;
    }

    public static void main(String[] args) {

        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

        System.out.println(merge(map1, map2));
    }
}
