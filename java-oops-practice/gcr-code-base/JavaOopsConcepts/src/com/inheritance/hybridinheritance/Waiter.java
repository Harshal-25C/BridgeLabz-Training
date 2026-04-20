package com.inheritance.hybridinheritance;

class Waiter extends Person implements Worker{

    Waiter(String name, int id){
        super(name, id);
    }

    @Override
    public void performDuties(){
        System.out.println("Waiter is serving food to customers.");
    }
}
