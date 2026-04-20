package com.day5.Petpal;

public class PetPalApp {
 public static void main(String[] args) {

     Pet pet = new Dog("Buddy", 3); //Polymorphism

     pet.makeSound();
     ((IInteractable) pet).feed();
     ((IInteractable) pet).play();
     ((IInteractable) pet).sleep();

     pet.showStatus();
 }
}
