package com.JUnit.BasicJUnitPrograms.PerformanceTestingUsingTimeout;

public class TaskService {

    // Simulates a long-running task
    public void longRunningTask() throws InterruptedException {
        Thread.sleep(1000); // 1 second (within timeout)
        System.out.println("Task completed");
    }
}
