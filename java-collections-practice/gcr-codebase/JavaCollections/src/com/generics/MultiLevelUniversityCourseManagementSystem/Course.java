package com.generics.MultiLevelUniversityCourseManagementSystem;

public class Course<T extends CourseType> {

    private String courseCode;
    private String courseName;
    private T courseType;

    public Course(String courseCode, String courseName, T courseType) {
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.courseType=courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    public void displayCourseDetails() {
        System.out.println(courseCode+" - "+courseName+" | "+courseType.getEvaluationMethod());
        courseType.evaluate();
    }
}
