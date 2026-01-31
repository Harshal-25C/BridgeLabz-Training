package com.StreamScenariosIntermediateProblems.BonusProblems;

import java.util.*;

public class StudentData {

    public static List<Student> getStudents() {

        return Arrays.asList(

            new Student(101,"Rohit Sharma","Rohit",20,"Male","Bhopal","CSE",12,
                    Arrays.asList("9876543210")),

            new Student(102,"Aman Verma","Aman",22,"Male","Indore","ECE",55,
                    Arrays.asList("9876543222")),

            new Student(103,"Sneha Singh","Sneha",18,"Female","Bhopal","IT",8,
                    Arrays.asList("9876543233")),

            new Student(104,"Saurabh Patel","Saurabh",27,"Male","Delhi","Mechanical",110,
                    Arrays.asList("9876543244")),

            new Student(105,"Kunal Mehta","Kunal",25,"Male","Indore","ECE",95,
                    Arrays.asList("9876543255")),

            new Student(106,"Sonal Jain","Sonal",30,"Female","Mumbai","CSE",40,
                    Arrays.asList("9876543266")),

            new Student(107,"Arjun Yadav","Arjun",28,"Male","Delhi","Mechanical",130,
                    Arrays.asList("9876543277")),

            new Student(108,"Neha Gupta","Neha",19,"Female","Bhopal","IT",15,
                    Arrays.asList("9876543288"))
        );
    }
}
