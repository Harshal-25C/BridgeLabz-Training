package com.StreamScenariosIntermediateProblems.BonusProblems;

import java.util.*;
import java.util.stream.Collectors;

public class DepartmentWithMinStudents {

    public static void main(String[] args) {

        String dept =
                StudentData.getStudents().stream()
                        .collect(Collectors.groupingBy(
                                Student::getDepartment, Collectors.counting()))
                        .entrySet().stream()
                        .min(Map.Entry.comparingByValue())
                        .get().getKey();

        System.out.println("Department with Minimum Students: " + dept);
    }
}

