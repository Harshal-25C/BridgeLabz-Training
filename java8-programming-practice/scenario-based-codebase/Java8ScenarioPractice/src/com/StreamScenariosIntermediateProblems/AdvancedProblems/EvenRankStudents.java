package com.StreamScenariosIntermediateProblems.AdvancedProblems;

import java.util.*;

public class EvenRankStudents {

    public static void main(String[] args) {

        StudentData.getStudents()
                .stream()
                .filter(s -> s.getRank() % 2 == 0)
                .forEach(System.out::println);
    }
}
