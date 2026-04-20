package com.Annotations.IntermediateLevel.AnnotationForLoggingMethodExecutionTime;

import java.lang.reflect.Method;

public class ExecutionTimeProcessor {

    public static void main(String[] args) throws Exception {

        PerformanceService service = new PerformanceService();
        Class<?> clazz = service.getClass();

        for(Method method : clazz.getDeclaredMethods()) {

            if(method.isAnnotationPresent(LogExecutionTime.class)) {

                long start = System.nanoTime();
                method.invoke(service);
                long end = System.nanoTime();

                System.out.println(
                    method.getName() + " executed in " + (end - start) + " ns"
                );
            }
        }
    }
}
