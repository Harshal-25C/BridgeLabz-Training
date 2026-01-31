package com.StreamScenariosIntermediateProblems.MinAndMax;

import java.util.*;

public class YoungestStudent {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        Student youngest =
                students.stream()
                        .min(Comparator.comparingInt(Student::getAge))
                        .get();

        System.out.println("Youngest Student: " + youngest.getName() +
                " | Age: " + youngest.getAge());
    }
}
