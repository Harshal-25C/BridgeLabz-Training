package com.forEachMethod;

import java.util.*;

public class IOTSensorReadings {

    public static void main(String[] args) {

        List<Double> sensorReadings = Arrays.asList(22.5, 35.8, 18.9, 42.1, 30.0);

        double threshold = 30.0;

        sensorReadings.stream()
                .filter(reading -> reading > threshold)
                .forEach(reading -> System.out.println("High Sensor Reading: " + reading));
    }
}
