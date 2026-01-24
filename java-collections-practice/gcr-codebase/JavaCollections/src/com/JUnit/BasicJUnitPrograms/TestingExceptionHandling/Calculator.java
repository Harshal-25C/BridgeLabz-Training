package com.JUnit.BasicJUnitPrograms.TestingExceptionHandling;

public class Calculator {

    public int divide(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}
