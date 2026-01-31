package com.StreamScenariosIntermediateProblems.GroupingAndAggregation;

import java.util.*;

public class TotalStudents {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        long count = students.stream().count();

        System.out.println("Total Students: " + count);
    }
}
