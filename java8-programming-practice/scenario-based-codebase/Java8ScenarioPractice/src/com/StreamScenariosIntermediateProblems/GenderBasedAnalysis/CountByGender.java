package com.StreamScenariosIntermediateProblems.GenderBasedAnalysis;

import java.util.*;
import java.util.stream.Collectors;

public class CountByGender {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        Map<String, Long> result =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getGender,
                                Collectors.counting()));

        System.out.println("Male & Female Count: " + result);
    }
}
