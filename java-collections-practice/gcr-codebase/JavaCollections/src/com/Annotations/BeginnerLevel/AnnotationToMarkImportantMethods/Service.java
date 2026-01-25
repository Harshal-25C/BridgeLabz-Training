package com.Annotations.BeginnerLevel.AnnotationToMarkImportantMethods;

public class Service {

    @ImportantMethod
    public void processPayment() {
        System.out.println("Processing payment...");
    }

    @ImportantMethod(level = "LOW")
    public void generateReport() {
        System.out.println("Generating report...");
    }

    public void helperMethod() {
        System.out.println("Helper method");
    }
}
