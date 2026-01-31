package com.StreamScenariosIntermediateProblems.FilteringAndMapping;

import java.util.*;

public class AgeGreaterThan25 {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        students.stream()
                .filter(s -> s.age > 25)
                .forEach(System.out::println);
    }
    class StudentData {

        public static List<Student> getStudents() {
            return List.of(
                new Student(1, "Rahul", 24, "Male", "Mumbai", 45, "Mechanical Engineering", "98765"),
                new Student(2, "Amit", 27, "Male", "Delhi", 30, "Computer Science", "87654"),
                new Student(3, "Neha", 26, "Female", "Bhopal", 55, "Mechanical Engineering", "76543"),
                new Student(4, "Priya", 23, "Female", "Mumbai", 15, "Electrical", "65432"),
                new Student(5, "Rohit", 28, "Male", "Indore", 40, "Mechanical Engineering", "54321")
            );
        }
    }
}
