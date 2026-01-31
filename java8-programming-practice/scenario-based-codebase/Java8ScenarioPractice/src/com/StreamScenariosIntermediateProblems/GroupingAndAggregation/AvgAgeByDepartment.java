package com.StreamScenariosIntermediateProblems.GroupingAndAggregation;

import java.util.*;
import java.util.stream.Collectors;

public class AvgAgeByDepartment {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        Map<String, Double> result =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getDepartment,
                                Collectors.averagingInt(Student::getAge)));

        System.out.println("Average Age by Department: " + result);
    }
}
