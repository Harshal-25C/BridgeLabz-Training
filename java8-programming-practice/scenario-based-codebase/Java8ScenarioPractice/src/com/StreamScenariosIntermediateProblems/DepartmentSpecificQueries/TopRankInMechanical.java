package com.StreamScenariosIntermediateProblems.DepartmentSpecificQueries;

import java.util.*;

public class TopRankInMechanical {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        Student topMechanical =
                students.stream()
                        .filter(s -> s.getDepartment().equalsIgnoreCase("Mechanical"))
                        .min(Comparator.comparingDouble(Student::getRank))
                        .orElse(null);

        System.out.println("Top Ranked in Mechanical: " + topMechanical);
    }
}
