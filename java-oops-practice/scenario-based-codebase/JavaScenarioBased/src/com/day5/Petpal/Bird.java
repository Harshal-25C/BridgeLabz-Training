package com.day5.Petpal;

class Bird extends Pet implements IInteractable {

 Bird(String name, int age) {
     super(name, "Bird", age);
 }

 public void feed() {
     decreaseHunger(10);
 }

 public void play() {
     decreaseEnergy(8);
     increaseHunger(5);
 }

 public void sleep() {
     increaseEnergy(20);
 }

 void makeSound() {
     System.out.println("Bird says: Tweet!");
 }
}
