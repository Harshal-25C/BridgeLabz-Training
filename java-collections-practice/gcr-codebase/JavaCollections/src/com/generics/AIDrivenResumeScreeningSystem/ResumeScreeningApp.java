package com.generics.AIDrivenResumeScreeningSystem;

import java.util.*;

public class ResumeScreeningApp {

    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 = new Resume<>("Amit", new SoftwareEngineer());

        Resume<DataScientist> r2 = new Resume<>("Neha", new DataScientist());

        Resume<ProductManager> r3 = new Resume<>("Rahul", new ProductManager());

        ResumeEvaluator.screenResume(r1);
        ResumeEvaluator.screenResume(r2);
        ResumeEvaluator.screenResume(r3);

        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        ScreeningPipeline.processResumes(roles);
    }
}
