package com.generics.MultiLevelUniversityCourseManagementSystem;

public class ExamCourse extends CourseType {
    public ExamCourse() {
        super("Exam-Based");
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluation through written examinations.");
    }
}
