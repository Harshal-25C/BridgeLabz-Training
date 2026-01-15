package com.generics.PersonalizedMealPlanGenerator;

public class VegenMeal implements MealPlan {

    public String getMealType() {
        return "Vegan";
    }

    public void generatePlan() {
        System.out.println("Vegan meal with plant-based proteins.");
    }
}
