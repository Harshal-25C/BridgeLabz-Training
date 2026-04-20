package com.JUnit.BasicJUnitPrograms.TestingCalculatorClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Calculator {

    //Addition
    public int add(int a, int b) {
        return a+b;
    }

    //Subtraction
    public int subtract(int a, int b) {
        return a-b;
    }

    //Multiplication
    public int multiply(int a, int b) {
        return a*b;
    }

    //Division
    public int divide(int a, int b) {
        if(b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a/b;
    }
}
