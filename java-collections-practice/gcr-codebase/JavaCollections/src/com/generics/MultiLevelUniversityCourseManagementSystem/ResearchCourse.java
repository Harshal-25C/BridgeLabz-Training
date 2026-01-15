package com.generics.MultiLevelUniversityCourseManagementSystem;

public class ResearchCourse extends CourseType {

    public ResearchCourse() {
        super("Research-Based");
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluation through research work and thesis.");
    }
}
