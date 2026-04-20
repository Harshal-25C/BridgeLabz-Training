package com.day5.FitTrack;

abstract class Workout implements ITrackable {

 protected String type;
 protected int duration;  //Duration in minutes
 protected double caloriesBurned;

 //Internal workout logs (not exposed directly)
 private boolean isActive;

 Workout(String type, int duration){
     this.type=type;
     this.duration=duration;
     this.isActive =false;
 }

 abstract void calculateCalories(double weight);

 @Override
 public void startWorkout(){
     isActive = true;
     System.out.println(type+" workout started.");
 }

 @Override
 public void stopWorkout(){
     isActive=false;
     System.out.println(type+" workout stopped.");
 }

 //Public method to access calories burned safely
 public double getCaloriesBurned() {
     return caloriesBurned;
 }
}
