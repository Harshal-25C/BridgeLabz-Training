package com.Annotations.PreRequisitesPrograms;

class Animals {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animals {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Animal{

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.makeSound();   
    }
}