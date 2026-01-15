package com.generics.PersonalizedMealPlanGenerator;

public class VegetarianMeal implements MealPlan {

    public String getMealType() {
        return "Vegetarian";
    }

    public void generatePlan() {
        System.out.println("Vegetarian meal with vegetables and grains.");
    }
}
