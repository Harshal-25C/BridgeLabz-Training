package com.inheritance.singleinheritance;

public class SmartHomeDemo{
    public static void main(String[] args) {

        Thermostat thermostat = new Thermostat("TH-101", true, 24);
        thermostat.displayStatus();
    }
}
