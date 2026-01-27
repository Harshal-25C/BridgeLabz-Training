package com.CSVDataHandling.AdvancedProblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Student {
    private int id;
    private String name;
    private int age;
    private int marks;

    public Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{id=" + id +
               ", name='" + name + '\'' +
               ", age=" + age +
               ", marks=" + marks + '}';
    }
}

public class ConvertCSVDataIntoObjects {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader("src/com/CSVDataHandling/AdvancedProblems/students.csv"))) {
            br.readLine(); // skip header
            String line;

            while((line = br.readLine()) != null) {
                String[] data = line.split(",");

                Student student = new Student(
                        Integer.parseInt(data[0]),
                        data[1],
                        Integer.parseInt(data[2]),
                        Integer.parseInt(data[3])
                );

                students.add(student);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }

        students.forEach(System.out::println);
    }
}
