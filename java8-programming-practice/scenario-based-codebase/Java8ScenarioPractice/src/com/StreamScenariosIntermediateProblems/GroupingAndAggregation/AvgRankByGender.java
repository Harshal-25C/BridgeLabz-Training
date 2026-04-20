package com.StreamScenariosIntermediateProblems.GroupingAndAggregation;

import java.util.*;
import java.util.stream.Collectors;

public class AvgRankByGender {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        Map<String, Double> result =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getGender,
                                Collectors.averagingDouble(Student::getRank)));

        System.out.println("Average Rank by Gender: " + result);
    }
}
