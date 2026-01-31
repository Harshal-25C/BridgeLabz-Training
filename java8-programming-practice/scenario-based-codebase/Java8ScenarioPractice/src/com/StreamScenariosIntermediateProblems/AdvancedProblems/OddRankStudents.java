package com.StreamScenariosIntermediateProblems.AdvancedProblems;

import java.util.*;

public class OddRankStudents {

    public static void main(String[] args) {

        StudentData.getStudents()
                .stream()
                .filter(s -> s.getRank() % 2 != 0)
                .forEach(System.out::println);
    }
}
