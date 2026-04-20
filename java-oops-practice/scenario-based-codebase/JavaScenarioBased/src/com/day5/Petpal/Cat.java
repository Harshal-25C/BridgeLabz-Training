package com.day5.Petpal;

class Cat extends Pet implements IInteractable{

 Cat(String name, int age){
     super(name, "Cat", age);
 }

 public void feed() {
     decreaseHunger(15);
 }

 public void play() {
     decreaseEnergy(10);
     increaseHunger(8);
 }

 public void sleep() {
     increaseEnergy(25);
 }

 void makeSound() {
     System.out.println("Cat says: Meow!");
 }
}
