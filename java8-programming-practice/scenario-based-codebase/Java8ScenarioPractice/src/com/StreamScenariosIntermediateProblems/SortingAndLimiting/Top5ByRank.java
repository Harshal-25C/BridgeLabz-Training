package com.StreamScenariosIntermediateProblems.SortingAndLimiting;


import java.util.*;

public class Top5ByRank {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        students.stream()
                .sorted(Comparator.comparingInt(s -> s.rank))
                .limit(5)
                .forEach(System.out::println);
    }
}
