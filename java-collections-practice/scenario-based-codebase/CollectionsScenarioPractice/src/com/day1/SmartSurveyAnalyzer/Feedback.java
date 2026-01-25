package com.day1.SmartSurveyAnalyzer;

public class Feedback<T> {
    private T type;
    private String message;
    private int rating;

    public Feedback(T type, String message, int rating) {
        this.type = type;
        this.message = message;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public String getMessage() {
        return message;
    }
}
