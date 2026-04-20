package com.day5.SensorDataOrdering;

public class SensorData {
    private long timestamp;
    private double temperature;

    public SensorData(long timestamp, double temperature) {
        this.timestamp=timestamp;
        this.temperature=temperature;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String toString() {
        return timestamp+" → "+temperature+"°C";
    }
}
