package com.generics.AIDrivenResumeScreeningSystem;

public class DataScientist extends JobRole {

    public DataScientist() {
        super("Data Scientist");
    }

    @Override
    public void evaluateResume() {
        System.out.println("Evaluating statistics, ML models, and data analysis.");
    }
}
