package com.generics.AIDrivenResumeScreeningSystem;
import java.util.List;

public class ScreeningPipeline {

    public static void processResumes(List<? extends JobRole> roles) {

        for(JobRole role:roles) {
            System.out.println("AI screening pipeline activated for: "+role.getRoleName());
            role.evaluateResume();
        }
    }
}
