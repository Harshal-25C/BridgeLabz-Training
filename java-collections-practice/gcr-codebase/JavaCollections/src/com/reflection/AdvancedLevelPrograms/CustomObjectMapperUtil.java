package com.reflection.AdvancedLevelPrograms;

import java.lang.reflect.*;
import java.util.*;

public class CustomObjectMapperUtil {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> props)
            throws Exception {

        T obj = clazz.getDeclaredConstructor().newInstance();

        for (Map.Entry<String, Object> entry : props.entrySet()) {
            Field field = clazz.getDeclaredField(entry.getKey());
            field.setAccessible(true);
            field.set(obj, entry.getValue());
        }
        return obj;
    }

    static class Person {
        private String name;
        private int age;

        public String toString() {
            return name + " - " + age;
        }
    }

    public static void main(String[] args) throws Exception {

        Map<String, Object> map = new HashMap<>();
        map.put("name", "Harshal");
        map.put("age", 20);

        Person p = toObject(Person.class, map);
        System.out.println(p);
    }
}