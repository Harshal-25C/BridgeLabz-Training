package com.interfaces.MarkerInterfaces.CloningPrototypeObjects;

class Vehicle implements Cloneable {

    String model;

    Vehicle(String model) {
        this.model = model;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
