package com.StreamScenariosIntermediateProblems.MinAndMax;

import java.util.*;

public class ThirdBestRank {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        Student thirdBest =
                students.stream()
                        .sorted(Comparator.comparingDouble(Student::getRank))
                        .skip(2)
                        .findFirst()
                        .get();

        System.out.println("Third Best Student: " + thirdBest.getName() +
                " | Rank: " + thirdBest.getRank());
    }
}
