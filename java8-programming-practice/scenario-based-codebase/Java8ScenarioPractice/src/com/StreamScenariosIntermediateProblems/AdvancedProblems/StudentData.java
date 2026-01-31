package com.StreamScenariosIntermediateProblems.AdvancedProblems;

import java.util.*;

public class StudentData {

    public static List<Student> getStudents() {

        return Arrays.asList(

            new Student(101,"Rohit Sharma","Rohit",20,"Male","Bhopal","CSE",1,
                    Arrays.asList("9876543210","9123456789")),

            new Student(102,"Aman Verma","Aman",22,"Male","Indore","ECE",2,
                    Arrays.asList("9876543222")),

            new Student(103,"Sneha Singh","Sneha",21,"Female","Bhopal","IT",3,
                    Arrays.asList("9876543233","9988776655")),

            new Student(104,"Saurabh Patel","Saurabh",23,"Male","Delhi","Mechanical",4,
                    Arrays.asList("9876543244")),

            new Student(105,"Kunal Mehta","Kunal",19,"Male","Indore","ECE",5,
                    Arrays.asList("9876543255","9000011111")),

            new Student(106,"Sonal Jain","Sonal",24,"Female","Mumbai","CSE",6,
                    Arrays.asList("9876543266"))
        );
    }
}
