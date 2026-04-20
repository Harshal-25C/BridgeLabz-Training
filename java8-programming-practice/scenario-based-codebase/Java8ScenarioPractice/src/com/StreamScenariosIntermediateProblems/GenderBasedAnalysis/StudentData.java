package com.StreamScenariosIntermediateProblems.GenderBasedAnalysis;
import java.util.*;

public class StudentData {

    public static List<Student> getStudents() {

        return Arrays.asList(

            new Student(101,"Rohit Sharma","Rohit",20,"Male","Bhopal","CSE",1.2,
                    Arrays.asList("9876543210","9123456789")),

            new Student(102,"Aman Verma","Aman",22,"Male","Indore","ECE",2.5,
                    Arrays.asList("9876543222")),

            new Student(103,"Neha Singh","Neha",21,"Female","Bhopal","IT",1.8,
                    Arrays.asList("9876543233","9988776655")),

            new Student(104,"Priya Patel","Priya",23,"Female","Delhi","Biotech",3.1,
                    Arrays.asList("9876543244")),

            new Student(105,"Kunal Mehta","Kunal",19,"Male","Indore","Mechanical",0.9,
                    Arrays.asList("9876543255","9000011111","8111122222")),

            new Student(106,"Ankit Mishra","Ankit",24,"Male","Bhopal","ECE",4.2,
                    Arrays.asList("9876543266")),

            new Student(107,"Sneha Jain","Sneha",20,"Female","Mumbai","CSE",2.0,
                    Arrays.asList("9876543277")),

            new Student(108,"Arjun Yadav","Arjun",22,"Male","Pune","IT",3.5,
                    Arrays.asList("9876543288"))
        );
    }
}
