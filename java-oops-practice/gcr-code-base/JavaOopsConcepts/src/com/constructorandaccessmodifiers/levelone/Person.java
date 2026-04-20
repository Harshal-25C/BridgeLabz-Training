package com.constructorandaccessmodifiers.levelone;

public class Person{

	String name;
    int age;

    //Parameterized constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Copy constructor
    Person(Person p){
        this.name = p.name;
        this.age = p.age;
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args){
        // Original person
        Person person1 = new Person("Harshh", 20);
        person1.display();

        System.out.println();

        //Clone using copy constructor
        Person person2 = new Person(person1);
        person2.display();
    }
}
