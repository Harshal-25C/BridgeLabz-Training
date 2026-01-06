package com.day5.FitTrack;

public class FitTrackApp {
 public static void main(String[] args) {

     UserProfile user = new UserProfile(
             "Harshal", 21, 70, "Weight Loss"
     );

     user.displayProfile();

     //Daily calorie target
     double dailyTarget = 500;

     //Creating workouts
     Workout cardio = new CardioWorkout(30);
     Workout strength = new StrengthWorkout(40);

     cardio.startWorkout();
     cardio.calculateCalories(user.getWeight());
     cardio.stopWorkout();

     strength.startWorkout();
     strength.calculateCalories(user.getWeight());
     strength.stopWorkout();

     //Total calories burned
     double totalCalories = cardio.getCaloriesBurned() +strength.getCaloriesBurned();

     //Operator usage for progress calculation
     double remainingCalories = dailyTarget-totalCalories;

     System.out.println("\nFitness Summary:");
     System.out.println("Calories Burned: "+totalCalories);
     System.out.println("Remaining Calories to Burn: " +remainingCalories);
 }
}
