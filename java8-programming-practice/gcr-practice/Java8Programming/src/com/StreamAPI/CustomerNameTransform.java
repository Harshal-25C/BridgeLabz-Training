package com.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class CustomerNameTransform {

    public static void main(String[] args) {

        List<String> customerNames = Arrays.asList("harshal", "amit", "zoya", "neha");

        List<String> formattedNames = customerNames.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        formattedNames.forEach(System.out::println);
    }
}
