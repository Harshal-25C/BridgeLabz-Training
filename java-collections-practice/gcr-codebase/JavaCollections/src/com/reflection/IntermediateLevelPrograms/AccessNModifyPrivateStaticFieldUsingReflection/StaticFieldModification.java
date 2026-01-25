package com.reflection.IntermediateLevelPrograms.AccessNModifyPrivateStaticFieldUsingReflection;

import java.lang.reflect.Field;

public class StaticFieldModification {

    public static void main(String[] args) throws Exception {

        Class<Configuration> clazz = Configuration.class;

        Field field = clazz.getDeclaredField("API_KEY");
        field.setAccessible(true);

        // Modify static field (null object reference)
        field.set(null, "NEW_API_KEY_999");

        // Retrieve updated value
        String updatedKey = (String) field.get(null);
        System.out.println("Updated API_KEY: " + updatedKey);
    }
}
