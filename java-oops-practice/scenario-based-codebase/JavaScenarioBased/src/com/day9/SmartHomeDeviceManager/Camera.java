package com.day9.SmartHomeDeviceManager;

class Camera extends Device {

    public Camera(int deviceId) {
        super(deviceId, 1.5);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Camera recording started");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Camera turned OFF");
    }

    public void reset() {
        System.out.println("Camera reset: clearing cache and rebooting");
    }
}
