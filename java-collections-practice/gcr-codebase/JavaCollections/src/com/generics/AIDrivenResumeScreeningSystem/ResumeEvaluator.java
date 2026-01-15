package com.generics.AIDrivenResumeScreeningSystem;

public class ResumeEvaluator {

    public static <T extends JobRole> void screenResume(Resume<T> resume) {

        System.out.println("Screening resume of "+resume.getCandidateName()+" for role: " 
                + resume.getJobRole().getRoleName());

        resume.getJobRole().evaluateResume();
    }
}
