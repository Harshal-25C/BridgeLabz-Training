package com.interfaces.ImplementingInterfaces.SmartDeviceControlInterface;

public class DeviceController {
    public static void main(String[] args) {

        SmartDevice device1 = new Light();
        SmartDevice device2 = new AC();
        SmartDevice device3 = new TV();

        device1.turnOn();
        device2.turnOn();
        device3.turnOn();

        device1.turnOff();
    }
}
