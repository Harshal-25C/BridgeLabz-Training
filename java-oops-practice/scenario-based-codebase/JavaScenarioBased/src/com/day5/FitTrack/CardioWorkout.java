package com.day5.FitTrack;

class CardioWorkout extends Workout{

 CardioWorkout(int duration){
     super("Cardio", duration);
 }

 //Cardio burns more calories
 @Override
 void calculateCalories(double weight){
     caloriesBurned = duration*weight*0.08;
 }
}

