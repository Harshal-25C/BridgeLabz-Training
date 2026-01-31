package com.StreamScenariosIntermediateProblems.AdvancedProblems;

import java.util.*;
import java.util.stream.Collectors;

public class MapDeptToStudents {

    public static void main(String[] args) {

        Map<String, List<Student>> map =
                StudentData.getStudents()
                        .stream()
                        .collect(Collectors.groupingBy(
                                Student::getDepartment));

        map.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
