package com.interfaces.FunctionalInterfaces;

import java.util.function.Predicate;

public class TemperatureAlertSystem {

    public static void main(String[] args) {

        double threshold = 38.0;

        Predicate<Double> isHighTemp = temp -> temp > threshold;

        double currentTemp = 39.5;

        if(isHighTemp.test(currentTemp)) {
            System.out.println("Alert! High temperature detected: " + currentTemp);
        }else {
            System.out.println("Temperature normal");
        }
    }
}
