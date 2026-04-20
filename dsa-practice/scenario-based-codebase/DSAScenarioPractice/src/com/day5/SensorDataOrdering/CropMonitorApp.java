package com.day5.SensorDataOrdering;

public class CropMonitorApp {

    public static void main(String[] args) {

        SensorData[] sensors = {
                new SensorData(1700005, 26.4),
                new SensorData(1700001, 25.1),
                new SensorData(1700003, 27.0)
        };

        SensorQuickSort.quickSort(sensors, 0, sensors.length-1);

        for(SensorData s:sensors) {
            System.out.println(s);
        }
    }
}
