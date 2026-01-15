package com.generics.AIDrivenResumeScreeningSystem;

public class Resume<T extends JobRole> {

    private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName=candidateName;
        this.jobRole=jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    public String getCandidateName() {
        return candidateName;
    }
}
