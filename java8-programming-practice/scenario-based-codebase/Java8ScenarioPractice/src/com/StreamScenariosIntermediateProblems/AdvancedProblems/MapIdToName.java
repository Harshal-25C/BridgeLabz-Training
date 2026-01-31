package com.StreamScenariosIntermediateProblems.AdvancedProblems;

import java.util.*;
import java.util.stream.Collectors;

public class MapIdToName {

    public static void main(String[] args) {

        Map<Integer, String> map =
                StudentData.getStudents()
                        .stream()
                        .collect(Collectors.toMap(
                                Student::getId,
                                Student::getName));

        System.out.println(map);
    }
}
