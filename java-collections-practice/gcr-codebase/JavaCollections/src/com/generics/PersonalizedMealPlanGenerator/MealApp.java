package com.generics.PersonalizedMealPlanGenerator;

public class MealApp {

    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());

        Meal<VegenMeal> veganMeal = new Meal<>(new VegenMeal());

        MealGenerator.generateMeal(vegMeal.getMealPlan());
        MealGenerator.generateMeal(veganMeal.getMealPlan());
    }
}
