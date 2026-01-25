package com.Annotations.BeginnerLevel.CreateTodoAnnotationForPendingTasks;

public class ProjectTasks {

    @Todo(
        task = "Implement login validation",
        assignedTo = "Harshal",
        priority = "HIGH"
    )
    public void loginFeature() {}

    @Todo(
        task = "Add payment gateway",
        assignedTo = "Amit"
    )
    public void paymentFeature() {}

    @Todo(
        task = "Improve UI design",
        assignedTo = "Sneha",
        priority = "LOW"
    )
    public void uiEnhancement() {}
}

