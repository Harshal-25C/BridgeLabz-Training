package com.interfaces.FunctionalInterfaces;

import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {

        int maxLimit = 50;

        Function<String, Integer> lengthFunction = String::length;

        String message = "Patient appointment confirmed for tomorrow";

        int length = lengthFunction.apply(message);

        if(length > maxLimit) {
            System.out.println("Message too long (" + length + " characters)");
        }else {
            System.out.println("Message length OK");
        }
    }
}
