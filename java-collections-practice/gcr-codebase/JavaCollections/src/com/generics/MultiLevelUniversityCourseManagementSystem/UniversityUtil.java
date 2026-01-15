package com.generics.MultiLevelUniversityCourseManagementSystem;

import java.util.List;

public class UniversityUtil {

    public static void displayCourses(List<? extends CourseType> courses) {
        for(CourseType ct:courses) {
            System.out.println(ct.getEvaluationMethod());
            ct.evaluate();
        }
    }
}
