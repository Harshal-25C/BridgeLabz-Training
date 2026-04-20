package com.StreamScenariosIntermediateProblems.BonusProblems;

import java.util.*;
import java.util.stream.Collectors;

public class CityWithMaxStudents {

    public static void main(String[] args) {

        String city =
                StudentData.getStudents().stream()
                        .collect(Collectors.groupingBy(
                                Student::getCity, Collectors.counting()))
                        .entrySet().stream()
                        .max(Map.Entry.comparingByValue())
                        .get().getKey();

        System.out.println("City with Maximum Students: " + city);
    }
}
