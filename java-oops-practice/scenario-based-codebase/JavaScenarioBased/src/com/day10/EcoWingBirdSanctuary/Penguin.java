package com.day10.EcoWingBirdSanctuary;

public class Penguin extends Bird implements Swimmable {
	
    public Penguin(String id, String name) {
        super(id, name, "Penguin");
    }

    public void swim() {
        System.out.println(getName()+" swims swiftly underwater.");
    }

    public void displayInfo() {
        System.out.println(getName()+" [Penguin] - Can Swim");
    }
}
