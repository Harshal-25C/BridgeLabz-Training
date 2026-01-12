package com.day2.TrainCompanion;

public class Compartment {
    String name;
    boolean hasPantry;
    boolean hasWiFi;
    Compartment prev;
    Compartment next;

    Compartment(String name, boolean hasPantry, boolean hasWiFi) {
        this.name = name;
        this.hasPantry = hasPantry;
        this.hasWiFi = hasWiFi;
    }
}
