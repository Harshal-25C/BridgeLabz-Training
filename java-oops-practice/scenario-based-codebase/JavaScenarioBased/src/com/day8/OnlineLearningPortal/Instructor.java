package com.day8.OnlineLearningPortal;

class Instructor extends User{
    public Instructor(String name, String email){
        super(name, email);
    }

    @Override
    public void printDetails() {
        System.out.println("Instructor: "+name+", Email: "+email);
    }
}
