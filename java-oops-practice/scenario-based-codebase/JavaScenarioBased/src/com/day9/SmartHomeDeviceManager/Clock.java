package com.day9.SmartHomeDeviceManager;

class clock extends Device {

    public clock(int deviceId) {
        super(deviceId, 0.2);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Door locked");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Door unlocked");
    }

    public void reset() {
        System.out.println("Lock reset and security keys refreshed");
    }
}
