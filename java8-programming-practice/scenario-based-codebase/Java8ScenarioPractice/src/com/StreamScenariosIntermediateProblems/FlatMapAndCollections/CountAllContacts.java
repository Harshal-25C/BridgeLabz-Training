package com.StreamScenariosIntermediateProblems.FlatMapAndCollections;

import java.util.*;

public class CountAllContacts {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        long count =
                students.stream()
                        .flatMap(s -> s.getContacts().stream())
                        .count();

        System.out.println("Total Contacts = " + count);
    }
}
