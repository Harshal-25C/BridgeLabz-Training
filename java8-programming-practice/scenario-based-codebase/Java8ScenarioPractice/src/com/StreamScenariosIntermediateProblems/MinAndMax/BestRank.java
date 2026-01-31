package com.StreamScenariosIntermediateProblems.MinAndMax;

import java.util.*;

public class BestRank {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        Student best =
                students.stream()
                        .min(Comparator.comparingDouble(Student::getRank))
                        .get();

        System.out.println("Best Rank Student: " + best.getName() +
                " | Rank: " + best.getRank());
    }
}

class StudentData {

    public static List<Student> getStudents() {

        return Arrays.asList(

            new Student(101, "Rohit Sharma", "Rohit", 20, "Male", "Bhopal", 1.2, "9876543210"),
            new Student(102, "Aman Verma", "Aman", 22, "Male", "Indore", 2.5, "9876543222"),
            new Student(103, "Neha Singh", "Neha", 21, "Female", "Bhopal", 1.8, "9876543233"),
            new Student(104, "Priya Patel", "Priya", 23, "Female", "Delhi", 3.1, "9876543244"),
            new Student(105, "Kunal Mehta", "Kunal", 19, "Male", "Indore", 0.9, "9876543255"),
            new Student(106, "Ankit Mishra", "Ankit", 24, "Male", "Bhopal", 4.2, "9876543266"),
            new Student(107, "Sneha Jain", "Sneha", 20, "Female", "Mumbai", 2.0, "9876543277"),
            new Student(108, "Arjun Yadav", "Arjun", 22, "Male", "Pune", 3.5, "9876543288")
        );
    }
}

