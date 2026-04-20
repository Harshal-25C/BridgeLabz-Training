package com.day5.FitTrack;

class StrengthWorkout extends Workout{

 StrengthWorkout(int duration){
     super("Strength", duration);
 }

 // Strength training burns calories differently
 @Override
 void calculateCalories(double weight) {
     caloriesBurned = duration * weight * 0.05;
 }
}
