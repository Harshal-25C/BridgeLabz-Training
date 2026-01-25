package com.reflection.AdvancedLevelPrograms;

import java.lang.reflect.*;

public class GenerateJSONRepresentationusingReflection {

	    public static String toJson(Object obj) throws Exception {

	        StringBuilder json = new StringBuilder("{");
	        Class<?> cls = obj.getClass();

	        for(Field f : cls.getDeclaredFields()) {
	            f.setAccessible(true);
	            json.append("\"").append(f.getName()).append("\":\"")
	                .append(f.get(obj))
	                .append("\",");
	        }

	        json.deleteCharAt(json.length() - 1);
	        json.append("}");

	        return json.toString();
	    }

	    static class Student {
	        String name;
	        int age;

	        Student(String n, int a) {
	            name = n;
	            age = a;
	        }
	    }

	    public static void main(String[] args) throws Exception {
	        Student s = new Student("Harshal", 20);
	        System.out.println(toJson(s));
	    }
	}