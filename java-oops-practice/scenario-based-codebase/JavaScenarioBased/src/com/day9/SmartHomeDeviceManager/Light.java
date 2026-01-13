package com.day9.SmartHomeDeviceManager;

class Light extends Device {

    public Light(int deviceId) {
        super(deviceId, 0.5);
    }

    public void turnOn() {
        setStatus(true);
        System.out.println("Light ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Light OFF");
    }

    public void reset() {
        System.out.println("Light brightness reset to default");
    }
}
