package com.StreamScenariosIntermediateProblems.FlatMapAndCollections;

import java.util.*;

public class UniqueContacts {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        students.stream()
                .flatMap(s -> s.getContacts().stream())
                .distinct()
                .forEach(System.out::println);
    }
}
