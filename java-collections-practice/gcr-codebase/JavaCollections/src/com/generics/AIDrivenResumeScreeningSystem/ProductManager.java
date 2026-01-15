package com.generics.AIDrivenResumeScreeningSystem;

public class ProductManager extends JobRole {

    public ProductManager() {
        super("Product Manager");
    }

    @Override
    public void evaluateResume() {
        System.out.println("Evaluating product strategy, leadership, and communication.");
    }
}
