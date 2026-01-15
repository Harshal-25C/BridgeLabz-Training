package com.generics.MultiLevelUniversityCourseManagementSystem;
import java.util.*;

public class UniversityApp {

    public static void main(String[] args) {

        Course<ExamCourse> math = new Course<>("M101", "Mathematics", new ExamCourse());

        Course<AssignmentCourse> cs = new Course<>("CS201", "Computer Science", new AssignmentCourse());

        Course<ResearchCourse> phd = new Course<>("R301", "AI Research", new ResearchCourse());

        math.displayCourseDetails();
        cs.displayCourseDetails();
        phd.displayCourseDetails();
    }
}
