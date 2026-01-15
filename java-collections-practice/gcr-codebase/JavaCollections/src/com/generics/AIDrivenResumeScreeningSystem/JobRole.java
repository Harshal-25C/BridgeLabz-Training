package com.generics.AIDrivenResumeScreeningSystem;

public abstract class JobRole {

    private String roleName;

    protected JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    //Role-specific evaluation logic
    public abstract void evaluateResume();
}

