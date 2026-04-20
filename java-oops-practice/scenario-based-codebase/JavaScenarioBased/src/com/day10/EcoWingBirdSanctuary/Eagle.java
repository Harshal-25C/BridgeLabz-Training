package com.day10.EcoWingBirdSanctuary;

public class Eagle extends Bird implements Flyable {

    public Eagle(String id, String name){
        super(id, name, "Eagle");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" soars high in the sky.");
    }

    @Override
    public void displayInfo() {
        System.out.println(getName()+" [Eagle] - Can Fly");
    }
}
