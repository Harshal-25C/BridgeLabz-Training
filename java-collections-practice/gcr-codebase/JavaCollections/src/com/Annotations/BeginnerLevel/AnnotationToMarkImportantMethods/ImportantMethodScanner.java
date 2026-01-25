package com.Annotations.BeginnerLevel.AnnotationToMarkImportantMethods;

import java.lang.reflect.Method;

public class ImportantMethodScanner {

    public static void main(String[] args) {

        Class<Service> clazz = Service.class;

        for(Method method : clazz.getDeclaredMethods()) {
            if(method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod im = method.getAnnotation(ImportantMethod.class);

                System.out.println("Method: " + method.getName());
                System.out.println("Importance Level: " + im.level());
                System.out.println("---------------------------");
            }
        }
    }
}
