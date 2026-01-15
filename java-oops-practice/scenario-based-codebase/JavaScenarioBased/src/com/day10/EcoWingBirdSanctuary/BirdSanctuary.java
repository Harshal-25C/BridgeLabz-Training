package com.day10.EcoWingBirdSanctuary;

import java.util.*;

public class BirdSanctuary {
    private List<Bird> birds = new ArrayList<>();

    public void addBird(Bird bird) {
        birds.add(bird);
    }

    public void displayAllBirds() {
        for(Bird b:birds) {
            b.displayInfo();
            b.eat();
        }
    }

    public void displayFlyingBirds() {
        for(Bird b:birds) {
            if(b instanceof Flyable) {
                ((Flyable) b).fly();
            }
        }
    }

    public void displaySwimmingBirds() {
        for(Bird b : birds) {
            if(b instanceof Swimmable) {
                ((Swimmable) b).swim();
            }
        }
    }

    public void removeBirdById(String id) {
        birds.removeIf(b -> b.getId().equals(id));
    }

    public void sanctuaryReport() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for(Bird b:birds) {
            boolean canFly = b instanceof Flyable;
            boolean canSwim = b instanceof Swimmable;

            if(canFly && canSwim) both++;
            else if(canFly) fly++;
            else if(canSwim) swim++;
            else neither++;
        }

        System.out.println("---- Sanctuary Report ----");
        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + neither);
    }
}
