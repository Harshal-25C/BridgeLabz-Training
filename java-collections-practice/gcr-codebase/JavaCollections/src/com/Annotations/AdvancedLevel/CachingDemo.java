package com.Annotations.AdvancedLevel;

import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CachingDemo {

    // Annotation
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    @interface CacheResult {}

    // Service Class 
    static class MathService {

        @CacheResult
        public int slowSquare(int x) {
            System.out.println("Computing square...");
            return x*x;
        }
    }

    // Cache Engine
    static Map<String, Object> cache = new HashMap<>();

    static Object invokeWithCache(Object obj, String methodName, int arg)throws Exception {

        Method method = obj.getClass().getMethod(methodName, int.class);
        String key = methodName + "_" + arg;

        if(method.isAnnotationPresent(CacheResult.class)) {

            if(cache.containsKey(key)) {
                System.out.println("Returning cached result");
                return cache.get(key);
            }

            Object result = method.invoke(obj, arg);
            cache.put(key, result);
            return result;
        }
        return method.invoke(obj, arg);
    }

    public static void main(String[] args) throws Exception {

        MathService service = new MathService();

        System.out.println(invokeWithCache(service, "slowSquare", 5));
        System.out.println(invokeWithCache(service, "slowSquare", 5));
    }
}
