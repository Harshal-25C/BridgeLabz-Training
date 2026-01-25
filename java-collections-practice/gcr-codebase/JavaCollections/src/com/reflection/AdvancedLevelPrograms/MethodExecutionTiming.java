package com.reflection.AdvancedLevelPrograms;

import java.lang.reflect.*;

public class MethodExecutionTiming {

    static class Task {
        public void longTask() throws Exception {
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws Exception {

        Task task = new Task();

        Method method = Task.class.getMethod("longTask");

        long start = System.nanoTime();
        method.invoke(task);
        long end = System.nanoTime();

        System.out.println("Execution Time: " + (end - start)/1_000_000 + " ms");
    }
}