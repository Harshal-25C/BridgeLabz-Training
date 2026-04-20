package com.Annotations.PreRequisitesPrograms;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Ayush")
    public void completeTask() {
        System.out.println("Task completed");
    }
}

public class CustomAnnotationDemo {

    public static void main(String[] args) throws Exception {

        Method method = TaskManager.class.getMethod("completeTask");

        if(method.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo info = method.getAnnotation(TaskInfo.class);

            System.out.println("Priority: " + info.priority());
            System.out.println("Assigned To: " + info.assignedTo());
        }
    }
}