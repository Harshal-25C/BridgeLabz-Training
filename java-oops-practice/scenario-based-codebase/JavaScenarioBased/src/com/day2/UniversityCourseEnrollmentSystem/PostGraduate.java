package com.day2.UniversityCourseEnrollmentSystem;

public class PostGraduate extends Student {

    PostGraduate(int id, String name, String course) {
        super(id, name, course);
    }

    @Override
    public void displayInfo() {
        System.out.println("Postgraduate -> " + getTranscript());
    }
}