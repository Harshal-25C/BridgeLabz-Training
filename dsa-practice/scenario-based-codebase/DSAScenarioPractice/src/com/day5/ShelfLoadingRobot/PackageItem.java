package com.day5.ShelfLoadingRobot;

public class PackageItem {
    private int id;
    private double weight;

    public PackageItem(int id, double weight) {
        this.id = id;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "Package "+id+" | Weight: "+weight;
    }
}
