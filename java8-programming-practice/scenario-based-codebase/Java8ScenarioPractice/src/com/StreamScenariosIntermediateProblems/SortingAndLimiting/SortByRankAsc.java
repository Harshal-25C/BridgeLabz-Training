package com.StreamScenariosIntermediateProblems.SortingAndLimiting;

import java.util.*;

public class SortByRankAsc {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        students.stream()
                .sorted(Comparator.comparingInt(s -> s.rank))
                .forEach(System.out::println);
    }


class StudentData {

    public static List<Student> getStudents() {
        return List.of(
            new Student(1, "Rahul", 24, "Male", "Mumbai", 45, "98765"),
            new Student(2, "Amit", 27, "Male", "Delhi", 30, "87654"),
            new Student(3, "Neha", 26, "Female", "Bhopal", 55, "76543"),
            new Student(4, "Priya", 23, "Female", "Mumbai", 15, "65432"),
            new Student(5, "Rohit", 28, "Male", "Indore", 40, "54321"),
            new Student(6, "Karan", 22, "Male", "Pune", 5, "23456"),
            new Student(7, "Anjali", 25, "Female", "Jaipur", 65, "34567"),
            new Student(8, "Suresh", 29, "Male", "Chennai", 75, "45678")
        );
    }
}
}
