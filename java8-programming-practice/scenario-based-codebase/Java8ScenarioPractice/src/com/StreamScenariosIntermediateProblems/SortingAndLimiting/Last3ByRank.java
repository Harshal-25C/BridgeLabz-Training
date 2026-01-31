package com.StreamScenariosIntermediateProblems.SortingAndLimiting;

import java.util.*;

public class Last3ByRank {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        int size = students.size();

        students.stream()
                .sorted(Comparator.comparingInt(s -> s.rank))
                .skip(size - 3)
                .forEach(System.out::println);
    }
}
