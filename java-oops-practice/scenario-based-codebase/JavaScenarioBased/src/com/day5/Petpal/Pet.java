package com.day5.Petpal;

abstract class Pet{
 protected String name;
 protected String type;
 protected int age;

 private int hunger;  
 private int energy;  

 //Constructor
 Pet(String name, String type, int age) {
     this.name = name;
     this.type = type;
     this.age = age;
     this.hunger = 50;  // default value
     this.energy = 50;
 }

 //Protected helpers to modify internal state
 protected void increaseEnergy(int value) {
     energy = Math.min(100, energy + value);
 }

 protected void decreaseEnergy(int value) {
     energy = Math.max(0, energy - value);
 }

 protected void decreaseHunger(int value) {
     hunger = Math.max(0, hunger - value);
 }

 protected void increaseHunger(int value) {
     hunger = Math.min(100, hunger + value);
 }

 //Read-only status
 public void showStatus() {
     System.out.println(name + " | Hunger: " + hunger + " | Energy: " + energy);
 }

 //Polymorphic behavior
 abstract void makeSound();
}
