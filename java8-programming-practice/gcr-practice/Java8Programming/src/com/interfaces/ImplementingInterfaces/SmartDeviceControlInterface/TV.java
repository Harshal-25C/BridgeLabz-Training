package com.interfaces.ImplementingInterfaces.SmartDeviceControlInterface;

class TV implements SmartDevice {
    public void turnOn() {
        System.out.println("TV turned ON");
    }

    public void turnOff() {
        System.out.println("TV turned OFF");
    }
}
