package com.StreamScenariosIntermediateProblems.FlatMapAndCollections;

import java.util.*;

public class MultipleContactsStudents {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        students.stream()
                .filter(s -> s.getContacts().size() > 1)
                .forEach(s ->
                        System.out.println(s.getName() + " -> " + s.getContacts()));
    }
}
