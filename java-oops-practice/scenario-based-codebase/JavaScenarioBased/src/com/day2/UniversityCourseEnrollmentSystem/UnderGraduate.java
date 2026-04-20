package com.day2.UniversityCourseEnrollmentSystem;

public class UnderGraduate extends Student {

    UnderGraduate(int id, String name, String course) {
        super(id, name, course);
    }

    @Override
    public void displayInfo() {
        System.out.println("Undergraduate -> " + getTranscript());
    }
}

