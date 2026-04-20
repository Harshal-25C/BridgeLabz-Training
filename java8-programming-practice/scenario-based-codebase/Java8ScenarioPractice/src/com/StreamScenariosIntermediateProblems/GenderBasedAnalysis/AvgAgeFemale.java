package com.StreamScenariosIntermediateProblems.GenderBasedAnalysis;

import java.util.*;

public class AvgAgeFemale {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        double avgFemaleAge =
                students.stream()
                        .filter(s -> s.getGender().equalsIgnoreCase("Female"))
                        .mapToInt(Student::getAge)
                        .average()
                        .orElse(0);

        System.out.println("Average Age of Female Students: " + avgFemaleAge);
    }
}
