package com.inheritance.multilevelinheritance;

public class CourseHierarchyDemo{
    public static void main(String[] args){

        PaidOnlineCourse course = new PaidOnlineCourse(
                "Java Full Stack",
                120,
                "Coursera",
                true,
                10000,
                20
        );

        System.out.println("Course Name: " + course.courseName);
        System.out.println("Final Fee: " + course.getFinalFee());
    }
}