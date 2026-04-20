package com.StreamScenariosIntermediateProblems.GenderBasedAnalysis;

import java.util.*;

public class HighestRankMale {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        Student bestMale =
                students.stream()
                        .filter(s -> s.getGender().equalsIgnoreCase("Male"))
                        .min(Comparator.comparingDouble(Student::getRank))
                        .orElse(null);

        System.out.println("Highest Ranked Male: " + bestMale);
    }
}
