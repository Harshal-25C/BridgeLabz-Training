package com.generics.MultiLevelUniversityCourseManagementSystem;

public abstract class CourseType {

    private String evaluationMethod;

    protected CourseType(String evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }

    public String getEvaluationMethod() {
        return evaluationMethod;
    }

    public abstract void evaluate();
}
