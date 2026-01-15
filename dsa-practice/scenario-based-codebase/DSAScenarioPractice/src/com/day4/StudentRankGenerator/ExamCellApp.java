package com.day4.StudentRankGenerator;

public class ExamCellApp {

    public static void main(String[] args) {

        Student[] students = {
                new Student(101, 85),
                new Student(102, 92),
                new Student(103, 78),
                new Student(104, 95)
        };

        StudentMergeSort.mergeSort(students);

        System.out.println("---- State Rank List ----");
        for(Student s:students) {
            System.out.println(s);
        }
    }
}
