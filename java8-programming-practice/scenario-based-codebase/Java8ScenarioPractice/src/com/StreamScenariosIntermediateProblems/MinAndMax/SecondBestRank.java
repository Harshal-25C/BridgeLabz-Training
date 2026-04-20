package com.StreamScenariosIntermediateProblems.MinAndMax;

import java.util.*;

public class SecondBestRank {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        Student secondBest =
                students.stream()
                        .sorted(Comparator.comparingDouble(Student::getRank))
                        .skip(1)
                        .findFirst()
                        .get();

        System.out.println("Second Best Student: " + secondBest.getName() +
                " | Rank: " + secondBest.getRank());
    }
}
