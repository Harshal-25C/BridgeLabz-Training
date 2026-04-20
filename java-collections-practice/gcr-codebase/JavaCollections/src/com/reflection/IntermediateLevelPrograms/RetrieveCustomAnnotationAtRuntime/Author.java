package com.reflection.IntermediateLevelPrograms.RetrieveCustomAnnotationAtRuntime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
    String name();
}
