package com.reflection.BasicLevelPrograms;

import java.lang.reflect.Method;

class Calculator {
    private int multiply(int a, int b) {
        return a*b;
    }
}

public class PrivateMethodInvoke {

    public static void main(String[] args) throws Exception {

        Calculator calculator = new Calculator();

        Class<?> clazz = calculator.getClass();
        Method method = clazz.getDeclaredMethod("multiply", int.class, int.class);

        method.setAccessible(true);

        int result = (int) method.invoke(calculator, 5, 4);
        System.out.println("Multiplication Result: " + result);
    }
}
