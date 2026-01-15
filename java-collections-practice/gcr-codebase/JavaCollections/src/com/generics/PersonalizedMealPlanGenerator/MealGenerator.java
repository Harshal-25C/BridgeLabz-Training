package com.generics.PersonalizedMealPlanGenerator;

public class MealGenerator {

    public static <T extends MealPlan> void generateMeal(T meal) {
        System.out.println("Generating "+meal.getMealType()+" meal plan...");
        meal.generatePlan();
    }
}
