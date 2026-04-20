package com.StreamScenariosIntermediateProblems.FlatMapAndCollections;

import java.util.*;

public class PrintAllContacts {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        students.stream()
                .flatMap(s -> s.getContacts().stream())
                .forEach(System.out::println);
    }
}
