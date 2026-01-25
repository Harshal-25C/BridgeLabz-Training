package com.Annotations.AdvancedLevel;

import java.lang.annotation.*;
import java.lang.reflect.Field;

public class JsonSerializationDemo {

    // Annotation 
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    @interface JsonField {
        String name();
    }

    // Model Class 
    static class User {

        @JsonField(name = "user_name")
        private String username;

        @JsonField(name = "user_age")
        private int age;

        User(String username, int age) {
            this.username = username;
            this.age = age;
        }
    }

    // JSON Converter 
    static String toJson(Object obj) throws Exception {

        StringBuilder json = new StringBuilder("{");
        Field[] fields = obj.getClass().getDeclaredFields();

        for(int i=0; i<fields.length; i++) {
            fields[i].setAccessible(true);

            if(fields[i].isAnnotationPresent(JsonField.class)) {
                JsonField jf = fields[i].getAnnotation(JsonField.class);

                json.append("\"")
                    .append(jf.name())
                    .append("\":\"")
                    .append(fields[i].get(obj))
                    .append("\"");

                if(i < fields.length-1) json.append(", ");
            }
        }
        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws Exception {
        User user = new User("Harshal", 22);
        System.out.println(toJson(user));
    }
}
