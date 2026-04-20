package com.StreamScenariosIntermediateProblems.DepartmentSpecificQueries;

import java.util.*;
import java.util.stream.Collectors;

public class ListStudentsDeptWise {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        Map<String, List<String>> deptWiseNames =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getDepartment,
                                Collectors.mapping(Student::getName, Collectors.toList())));

        deptWiseNames.forEach((dept, names) ->
                System.out.println(dept + " -> " + names));
    }
}
