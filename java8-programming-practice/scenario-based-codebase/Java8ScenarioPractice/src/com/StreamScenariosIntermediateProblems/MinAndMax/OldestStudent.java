package com.StreamScenariosIntermediateProblems.MinAndMax;

import java.util.*;

public class OldestStudent {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        Student oldest =
                students.stream()
                        .max(Comparator.comparingInt(Student::getAge))
                        .get();

        System.out.println("Oldest Student: " + oldest.getName() +
                " | Age: " + oldest.getAge());
    }
}
