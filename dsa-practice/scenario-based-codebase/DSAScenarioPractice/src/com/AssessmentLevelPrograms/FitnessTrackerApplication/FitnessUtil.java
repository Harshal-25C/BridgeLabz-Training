package com.AssessmentLevelPrograms.FitnessTrackerApplication;

public class FitnessUtil {
    public int calculateCalorie(String activityName, int durationInHours,
                                int intensityLevel, int weight) throws InvalidException {

        int caloriesPerMin;

        switch(activityName) {
            case "Walking":
                caloriesPerMin = 3;
                break;
            case "Running":
                caloriesPerMin = 7;
                break;
            case "Cycling":
                caloriesPerMin = 5;
                break;
            default:
                throw new InvalidException("Error:Invalid activity name.");
        }

        if(durationInHours <= 0 || intensityLevel < 1 || intensityLevel > 9) {
            throw new InvalidException("Error:Invalid duration or intensity.");
        }

        if(weight <= 0) {
            throw new InvalidException("Error:User Weight is invalid.");
        }

        return (caloriesPerMin * durationInHours * intensityLevel * 60) / weight;
    }
}
