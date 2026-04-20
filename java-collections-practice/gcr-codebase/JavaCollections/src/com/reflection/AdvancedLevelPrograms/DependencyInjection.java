package com.reflection.AdvancedLevelPrograms;

import java.lang.annotation.*;
import java.lang.reflect.*;

public class DependencyInjection {
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    @interface Inject {}

    static class Engine {
        void start() {
            System.out.println("Engine started...");
        }
    }

    static class Car {
        @Inject
        private Engine engine;

        void drive() {
            engine.start();
            System.out.println("Car is moving...");
        }
    }

    public static <T> T create(Class<T> cls) throws Exception {

        T obj = cls.getDeclaredConstructor().newInstance();

        for(Field field : cls.getDeclaredFields()) {
            if(field.isAnnotationPresent(Inject.class)) {
                Object dependency = field.getType().getDeclaredConstructor().newInstance();
                field.setAccessible(true);
                field.set(obj, dependency);
            }
        }
        return obj;
    }

    public static void main(String[] args) throws Exception {

        Car car = create(Car.class);
        car.drive();
    }
}