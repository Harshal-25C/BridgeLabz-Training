package com.reflection.IntermediateLevelPrograms.DynamicMethodInvocationUsingReflection;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocation {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter method name (add / subtract / multiply): ");
        String methodName = sc.next();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        MathOperations obj = new MathOperations();
        Class<?> clazz = obj.getClass();

        Method method = clazz.getMethod(methodName, int.class, int.class);

        int result = (int) method.invoke(obj, a, b);
        System.out.println("Result: " + result);
    }
}
