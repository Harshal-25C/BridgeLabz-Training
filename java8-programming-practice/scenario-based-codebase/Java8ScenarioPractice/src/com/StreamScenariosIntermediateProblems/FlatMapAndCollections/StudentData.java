package com.StreamScenariosIntermediateProblems.FlatMapAndCollections;

import java.util.*;

public class StudentData {

    public static List<Student> getStudents() {

        return Arrays.asList(

            new Student(101,"Rohit Sharma","Rohit",20,"Male","Bhopal",1.2,
                    Arrays.asList("9876543210","9123456789")),

            new Student(102,"Aman Verma","Aman",22,"Male","Indore",2.5,
                    Arrays.asList("9876543222")),

            new Student(103,"Neha Singh","Neha",21,"Female","Bhopal",1.8,
                    Arrays.asList("9876543233","9988776655")),

            new Student(104,"Priya Patel","Priya",23,"Female","Delhi",3.1,
                    Arrays.asList("9876543244")),

            new Student(105,"Kunal Mehta","Kunal",19,"Male","Indore",0.9,
                    Arrays.asList("9876543255","9000011111","8111122222"))
        );
    }
}
