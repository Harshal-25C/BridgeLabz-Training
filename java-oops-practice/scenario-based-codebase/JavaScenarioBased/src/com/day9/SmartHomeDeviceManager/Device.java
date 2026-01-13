package com.day9.SmartHomeDeviceManager;

abstract class Device implements IControllable {

    protected int deviceId;
    private boolean status;              // Encapsulated
    protected double energyUsage;

    protected String firmwareLog;         // secured (protected)

    public Device(int deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        this.firmwareLog = "Firmware initialized";
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    // Operator usage
    public double calculateMonthlyUsage(int hours) {
        return energyUsage*hours;
    }

    public abstract void reset();
}
