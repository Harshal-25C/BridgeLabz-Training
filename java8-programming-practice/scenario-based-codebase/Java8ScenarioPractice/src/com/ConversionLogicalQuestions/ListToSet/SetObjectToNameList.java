package com.ConversionLogicalQuestions.ListToSet;

import java.util.*;
import java.util.stream.Collectors;

public class SetObjectToNameList {

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {

        Set<Person> people = new HashSet<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));

        List<String> names = people.stream()
                .map(p -> p.name)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}
