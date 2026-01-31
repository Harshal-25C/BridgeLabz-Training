package com.StreamScenariosIntermediateProblems.ConditionalAndMatching;

import java.util.*;

public class AllMatchAgeAbove20 {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        boolean allAbove20 =
                students.stream()
                        .allMatch(s -> s.getAge() > 20);

        System.out.println("All students above age 20? " + allAbove20);
    }
}

