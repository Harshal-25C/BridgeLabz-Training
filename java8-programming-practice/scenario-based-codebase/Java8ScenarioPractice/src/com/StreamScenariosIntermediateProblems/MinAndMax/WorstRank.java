package com.StreamScenariosIntermediateProblems.MinAndMax;

import java.util.*;

public class WorstRank {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        Student worst =
                students.stream()
                        .max(Comparator.comparingDouble(Student::getRank))
                        .get();

        System.out.println("Worst Rank Student: " + worst.getName() +
                " | Rank: " + worst.getRank());
    }
}
