package com.StreamScenariosIntermediateProblems.BonusProblems;

import java.util.*;

public class Top3Youngest {

    public static void main(String[] args) {

        StudentData.getStudents().stream()
                .sorted(Comparator.comparingInt(Student::getAge))
                .limit(3)
                .forEach(System.out::println);
    }
}
