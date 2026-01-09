package com.day8.OnlineLearningPortal;

abstract class User{
    protected String name;
    protected String email;

    public User(String name, String email){
        this.name=name;
        this.email=email;
    }

    public abstract void printDetails();
}
