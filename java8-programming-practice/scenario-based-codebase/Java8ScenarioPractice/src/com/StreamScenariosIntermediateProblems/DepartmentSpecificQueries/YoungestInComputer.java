package com.StreamScenariosIntermediateProblems.DepartmentSpecificQueries;

import java.util.*;

public class YoungestInComputer {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        Student youngest =
                students.stream()
                        .filter(s -> s.getDepartment().equalsIgnoreCase("Computer"))
                        .min(Comparator.comparingInt(Student::getAge))
                        .orElse(null);

        System.out.println("Youngest in Computer: " + youngest);
    }
}
