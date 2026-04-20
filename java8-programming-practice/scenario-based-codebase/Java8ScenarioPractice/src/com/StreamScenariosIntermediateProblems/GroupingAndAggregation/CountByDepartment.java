package com.StreamScenariosIntermediateProblems.GroupingAndAggregation;

import java.util.*;
import java.util.stream.Collectors;

public class CountByDepartment {

    public static void main(String[] args) {

        List<Student> students = StudentData.getStudents();

        Map<String, Long> result =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getDepartment,
                                Collectors.counting()));

        System.out.println("Count by Department: " + result);
    }
}


class StudentData {

    public static List<Student> getStudents() {
        return Arrays.asList(
            new Student(1,"Rohit","Rohit",20,"Male","Bhopal","CSE",8.2,"9999"),
            new Student(2,"Aman","Aman",22,"Male","Indore","ECE",7.6,"8888"),
            new Student(3,"Neha","Neha",21,"Female","Bhopal","CSE",8.9,"7777"),
            new Student(4,"Priya","Priya",23,"Female","Delhi","IT",9.1,"6666"),
            new Student(5,"Kunal","Kunal",20,"Male","Indore","IT",7.2,"5555"),
            new Student(6,"Ankit","Ankit",24,"Male","Bhopal","ECE",8.0,"4444")
        );
    }
}
