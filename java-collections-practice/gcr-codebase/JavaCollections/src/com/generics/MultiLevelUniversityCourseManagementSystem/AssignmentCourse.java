package com.generics.MultiLevelUniversityCourseManagementSystem;

public class AssignmentCourse extends CourseType {
    public AssignmentCourse() {
        super("Assignment-Based");
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluation through assignments.");
    }
}
