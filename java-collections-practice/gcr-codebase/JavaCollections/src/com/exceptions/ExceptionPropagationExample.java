package com.exceptions;

public class ExceptionPropagationExample {

    static void method1() {
        int result = 10/0; //ArithmeticException
    }

    static void method2() {
        method1();
    }

    public static void main(String[] args) {

        try{
            method2();

        }catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
