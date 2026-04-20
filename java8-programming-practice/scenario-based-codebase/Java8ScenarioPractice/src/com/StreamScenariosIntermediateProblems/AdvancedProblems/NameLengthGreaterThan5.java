package com.StreamScenariosIntermediateProblems.AdvancedProblems;

import java.util.*;

public class NameLengthGreaterThan5 {

    public static void main(String[] args) {

        StudentData.getStudents()
                .stream()
                .filter(s -> s.getName().length() > 5)
                .forEach(System.out::println);
    }
}
