package com.inheritance.hybridinheritance;

interface Worker{
    void performDuties();
}

class Person{
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
