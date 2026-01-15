package com.day10.EcoWingBirdSanctuary;

public class Duck extends Bird implements Flyable, Swimmable {
    public Duck(String id, String name) {
        super(id, name, "Duck");
    }

    public void fly() {
        System.out.println(getName()+" flies short distances.");
    }

    public void swim() {
        System.out.println(getName()+" swims in the pond.");
    }

    public void displayInfo() {
        System.out.println(getName()+" [Duck] - Can Fly & Swim");
    }
}
