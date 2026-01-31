package com.StreamScenariosIntermediateProblems.ConditionalAndMatching;

import java.util.*;

public class AnyMatchBiotech {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        boolean exists =
                students.stream()
                        .anyMatch(s -> s.getDepartment().equalsIgnoreCase("Biotech"));

        System.out.println("Any student in Biotech? " + exists);
    }
}
