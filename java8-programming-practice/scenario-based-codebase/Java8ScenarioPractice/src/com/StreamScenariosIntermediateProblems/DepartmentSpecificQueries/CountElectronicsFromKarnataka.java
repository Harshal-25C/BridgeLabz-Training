package com.StreamScenariosIntermediateProblems.DepartmentSpecificQueries;

import java.util.*;

public class CountElectronicsFromKarnataka {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        long count =
                students.stream()
                        .filter(s -> s.getDepartment().equalsIgnoreCase("Electronics"))
                        .filter(s -> s.getState().equalsIgnoreCase("Karnataka"))
                        .count();

        System.out.println("Electronics students from Karnataka: " + count);
    }
}
