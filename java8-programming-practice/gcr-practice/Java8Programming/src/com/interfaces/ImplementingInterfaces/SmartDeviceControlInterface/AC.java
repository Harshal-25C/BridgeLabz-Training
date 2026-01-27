package com.interfaces.ImplementingInterfaces.SmartDeviceControlInterface;

class AC implements SmartDevice {
    public void turnOn() {
        System.out.println("AC turned ON");
    }

    public void turnOff() {
        System.out.println("AC turned OFF");
    }
}
