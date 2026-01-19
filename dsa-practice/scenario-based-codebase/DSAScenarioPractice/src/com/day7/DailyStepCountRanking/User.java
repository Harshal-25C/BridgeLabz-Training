package com.day7.DailyStepCountRanking;

public class User {
    int userId;
    String name;
    int steps;

    public User(int userId, String name, int steps) {
        this.userId = userId;
        this.name = name;
        this.steps = steps;
    }

    @Override
    public String toString() {
        return "UserId: " + userId +", Name: " + name +", Steps: " + steps;
    }
}
