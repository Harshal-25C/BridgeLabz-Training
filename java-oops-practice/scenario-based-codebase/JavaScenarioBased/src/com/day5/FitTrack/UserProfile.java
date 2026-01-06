package com.day5.FitTrack;

class UserProfile{

 private String name;
 private int age;
 private double weight; //Sensitive health data (Encapsulation)
 private String goal;

 UserProfile(String name, int age, double weight){
     this.name = name;
     this.age = age;
     this.weight = weight;
     this.goal = "General Fitness";
 }

 //Constructor with custom goal
 UserProfile(String name, int age, double weight, String goal){
     this.name = name;
     this.age = age;
     this.weight = weight;
     this.goal = goal;
 }

 //Public method to safely access weight
 public double getWeight() {
     return weight;
 }

 void displayProfile(){
     System.out.println("User: " + name);
     System.out.println("Age: " + age);
     System.out.println("Goal: " + goal);
 }
}
