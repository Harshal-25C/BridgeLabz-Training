package com.StreamScenariosIntermediateProblems.GroupingAndAggregation;

import java.util.*;
import java.util.stream.Collectors;

public class HighestAvgRankDepartment {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        Map<String, Double> avgMap =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getDepartment,
                                Collectors.averagingDouble(Student::getRank)));

        String topDept =
                avgMap.entrySet()
                      .stream()
                      .max(Map.Entry.comparingByValue())
                      .get()
                      .getKey();

        System.out.println("Department with Highest Avg Rank: " + topDept);
    }
}
