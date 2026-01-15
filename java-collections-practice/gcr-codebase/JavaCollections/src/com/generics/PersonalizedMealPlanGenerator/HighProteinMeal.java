package com.generics.PersonalizedMealPlanGenerator;

public class HighProteinMeal implements MealPlan {

    public String getMealType() {
        return "High Protein";
    }

    public void generatePlan() {
        System.out.println("High protein meal with legumes and protein sources.");
    }
}
