package com.day5.Petpal;

class Dog extends Pet implements IInteractable{

 Dog(String name, int age) {
     super(name, "Dog", age);
 }

 public void feed() {
     decreaseHunger(20);
 }

 public void play() {
     decreaseEnergy(15);
     increaseHunger(10);
 }

 public void sleep() {
     increaseEnergy(30);
 }

 void makeSound() {
     System.out.println("Dog says: Woof!");
 }
}
