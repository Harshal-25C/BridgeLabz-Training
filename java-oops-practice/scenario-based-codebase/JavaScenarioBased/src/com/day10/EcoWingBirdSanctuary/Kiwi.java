package com.day10.EcoWingBirdSanctuary;

public class Kiwi extends Bird {

    public Kiwi(String id, String name) {
        super(id, name, "Kiwi");
    }

    public void displayInfo() {
        System.out.println(getName()+" [Kiwi] - Cannot Fly or Swim");
    }
}
