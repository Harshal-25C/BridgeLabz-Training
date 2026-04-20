package com.MethodReferences;

import java.util.List;

public class PatientIDPrinter {

    public static void main(String[] args) {

        List<Integer> patientIds = List.of(101, 102, 103, 104);

        // Method reference instead of lambda
        patientIds.forEach(System.out::println);
    }
}
