package com.Annotations.PreRequisitesPrograms;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

class Developer {

    @BugReport(description = "Null Pointer issue")
    @BugReport(description = "Memory leak detected")
    public void fixBugs() {
        System.out.println("Fixing bugs...");
    }
}

public class RepeatableAnnotationDemo {

    public static void main(String[] args) throws Exception {

        Method method = Developer.class.getMethod("fixBugs");

        BugReport[] reports = method.getAnnotationsByType(BugReport.class);

        for(BugReport bug : reports) {
            System.out.println("Bug: " + bug.description());
        }
    }
}