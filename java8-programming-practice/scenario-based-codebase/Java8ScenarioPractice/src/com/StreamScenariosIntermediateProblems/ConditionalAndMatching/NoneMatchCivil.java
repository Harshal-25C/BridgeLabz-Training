package com.StreamScenariosIntermediateProblems.ConditionalAndMatching;

import java.util.*;

public class NoneMatchCivil {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        boolean noCivil =
                students.stream()
                        .noneMatch(s -> s.getDepartment().equalsIgnoreCase("Civil"));

        System.out.println("No student in Civil? " + noCivil);
    }
}
