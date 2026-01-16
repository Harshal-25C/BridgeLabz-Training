package com.collections.MapInterface;

import java.util.*;

public class WordFrequencyCounter {

    public static Map<String, Integer> countWords(String text) {

        Map<String, Integer> map = new HashMap<>();

        text = text.toLowerCase().replaceAll("[^a-z ]", "");
        String[] words = text.split("\\s+");

        for(String word:words) {
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        return map;
    }

    public static void main(String[] args) {
        String input = "Hello world, hello Java!";
        System.out.println(countWords(input));
    }
}
