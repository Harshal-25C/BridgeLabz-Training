package com.reflection.BasicLevelPrograms;

//ClassNotFoundException occurs in Reflection when the fully qualified 
//class name is not provided to Class.forName()
public class DynamicObjectCreation {

    public static void main(String[] args) throws Exception {

    	Class<?> clazz = Class.forName("com.reflection.BasicLevelPrograms.Student");


        Object obj = clazz.getDeclaredConstructor().newInstance();

        System.out.println("Object Type: " + obj.getClass().getName());
    }
}

class Student {
    public Student() {
        System.out.println("Student object created dynamically");
    }
}
