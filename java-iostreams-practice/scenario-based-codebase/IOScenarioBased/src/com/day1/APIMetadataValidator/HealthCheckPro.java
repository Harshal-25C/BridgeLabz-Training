package com.day1.APIMetadataValidator;

import java.lang.reflect.Method;

public class HealthCheckPro {

    public static void main(String[] args) {
        Class<?> clazz = LabController.class;

        for(Method method : clazz.getDeclaredMethods()) {

            if(!method.isAnnotationPresent(PublicAPI.class)) {
                System.out.println("   Missing @PublicAPI on: " + method.getName());
            }else {
                PublicAPI api = method.getAnnotation(PublicAPI.class);
                System.out.println("   API: " + method.getName());
                System.out.println("   Description: " + api.description());
                System.out.println("   Auth Required: " +
                        method.isAnnotationPresent(RequiresAuth.class));
            }
        }
    }
}
