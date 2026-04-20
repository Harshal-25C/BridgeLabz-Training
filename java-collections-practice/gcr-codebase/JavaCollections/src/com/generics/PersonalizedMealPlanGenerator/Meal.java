package com.generics.PersonalizedMealPlanGenerator;

public class Meal<T extends MealPlan> {

    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan=mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }
}
