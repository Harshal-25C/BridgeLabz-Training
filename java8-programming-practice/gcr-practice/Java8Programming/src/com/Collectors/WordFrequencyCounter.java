package com.Collectors;

import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String paragraph = "java stream api java collectors stream api";

        Map<String, Long> wordCount = Arrays.stream(paragraph.split("\\s+"))
                      .collect(Collectors.toMap(
                    		  word -> word,
                              word -> 1L,
                              Long::sum
                      ));

        wordCount.forEach((word, count) -> System.out.println(word + " → " + count));
    }
}
