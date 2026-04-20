package com.MethodReferences;

import java.util.List;
import java.util.stream.Collectors;

public class NameUppercase {

    public static void main(String[] args) {

        List<String> names = List.of("harshal", "aman", "neha");

        List<String> upperNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        upperNames.forEach(System.out::println);
    }
}
