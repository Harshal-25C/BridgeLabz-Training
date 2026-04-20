package com.jsonData.BasicProblems;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class Student {
    public String name;
    public int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ListToJsonArray {
    public static void main(String[] args) throws Exception {

        List<Student> students = List.of(
                new Student("Amit", 22),
                new Student("Neha", 26),
                new Student("Rahul", 28)
        );

        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writerWithDefaultPrettyPrinter()
                      .writeValueAsString(students)
        );
    }
}
