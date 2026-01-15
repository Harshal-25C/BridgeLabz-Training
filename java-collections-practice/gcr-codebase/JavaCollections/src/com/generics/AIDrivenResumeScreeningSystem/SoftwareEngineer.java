package com.generics.AIDrivenResumeScreeningSystem;

public class SoftwareEngineer extends JobRole{
    public SoftwareEngineer(){
        super("Software Engineer");
    }

    @Override
    public void evaluateResume() {
        System.out.println("Evaluating coding skills, DSA, and system design.");
    }
}
