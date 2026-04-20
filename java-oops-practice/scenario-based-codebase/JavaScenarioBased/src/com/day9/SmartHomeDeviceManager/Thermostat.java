package com.day9.SmartHomeDeviceManager;

class Thermostat extends Device {

    public Thermostat(int deviceId) {
        super(deviceId, 2.0);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Thermostat activated");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat turned OFF");
    }

    public void reset() {
        System.out.println("Thermostat temperature reset to 24°C");
    }
}
