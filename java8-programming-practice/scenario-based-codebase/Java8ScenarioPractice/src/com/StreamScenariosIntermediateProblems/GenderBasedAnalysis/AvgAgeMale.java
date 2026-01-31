package com.StreamScenariosIntermediateProblems.GenderBasedAnalysis;

import java.util.*;

public class AvgAgeMale {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        double avgMaleAge =
                students.stream()
                        .filter(s -> s.getGender().equalsIgnoreCase("Male"))
                        .mapToInt(Student::getAge)
                        .average()
                        .orElse(0);

        System.out.println("Average Age of Male Students: " + avgMaleAge);
    }
}
