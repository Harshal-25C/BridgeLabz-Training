package com.StreamScenariosIntermediateProblems.SortingAndLimiting;

import java.util.*;

public class SortByNameThenRank {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        students.stream()
                .sorted(Comparator
                        .comparing((Student s) -> s.firstName)
                        .thenComparingInt(s -> s.rank))
                .forEach(System.out::println);
    }
}

