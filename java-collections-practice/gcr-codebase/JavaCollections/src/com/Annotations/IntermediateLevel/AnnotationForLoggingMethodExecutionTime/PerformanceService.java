package com.Annotations.IntermediateLevel.AnnotationForLoggingMethodExecutionTime;

public class PerformanceService {

    @LogExecutionTime
    public void fastMethod() {
        for(int i=0; i<1_000; i++);
    }

    @LogExecutionTime
    public void slowMethod() {
        for(int i=0; i<10_000_000; i++);
    }
}
