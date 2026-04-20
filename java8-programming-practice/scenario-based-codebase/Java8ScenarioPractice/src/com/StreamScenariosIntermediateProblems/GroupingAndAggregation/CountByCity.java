package com.StreamScenariosIntermediateProblems.GroupingAndAggregation;

import java.util.*;
import java.util.stream.Collectors;

public class CountByCity {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        Map<String, Long> result =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getCity,
                                Collectors.counting()));

        System.out.println("Count by City: " + result);
    }
}

