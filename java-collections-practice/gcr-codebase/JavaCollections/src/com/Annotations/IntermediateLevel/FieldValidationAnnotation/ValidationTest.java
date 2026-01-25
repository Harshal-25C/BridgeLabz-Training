package com.Annotations.IntermediateLevel.FieldValidationAnnotation;

public class ValidationTest {

    public static void main(String[] args) {

        User u1 = new User("Harshal");
        System.out.println(u1);

        User u2 = new User("VeryLongUsername"); // Exception
    }
}
