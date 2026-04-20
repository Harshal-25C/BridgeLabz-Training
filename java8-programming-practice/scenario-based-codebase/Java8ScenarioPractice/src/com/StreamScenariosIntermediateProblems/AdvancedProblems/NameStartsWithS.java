package com.StreamScenariosIntermediateProblems.AdvancedProblems;
import java.util.*;

public class NameStartsWithS {

    public static void main(String[] args) {

        StudentData.getStudents()
                .stream()
                .filter(s -> s.getName().startsWith("S"))
                .forEach(System.out::println);
    }
}
