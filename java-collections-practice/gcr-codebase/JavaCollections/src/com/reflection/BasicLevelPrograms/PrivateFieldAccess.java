package com.reflection.BasicLevelPrograms;

import java.lang.reflect.Field;

class Person {
    private int age = 25;
}

public class PrivateFieldAccess {

    public static void main(String[] args) throws Exception {

        Person person = new Person();

        Class<?> clazz = person.getClass();
        Field field = clazz.getDeclaredField("age");

        field.setAccessible(true); // bypass private access

        // Modify private field
        field.set(person, 30);

        // Retrieve private field value
        int ageValue = (int) field.get(person);
        System.out.println("Modified Age: " + ageValue);
    }
}
