package com.AssessmentLevelPrograms.FitnessTrackerApplication;
import java.util.*;

public class UserInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FitnessUtil fu = new FitnessUtil();

        try{

            System.out.println("Enter workout routine (activity:duration:intensity): ");
            String input = sc.nextLine();

            String[] parts = input.split(":");

            if(parts.length != 3) {
                throw new InvalidException("Error:Invalid activity data format.");
            }

            String activityName = parts[0];
            int durationInHours = Integer.parseInt(parts[1]);
            int intensityLevel = Integer.parseInt(parts[2]);

            System.out.println("Enter weight:");
            int weight = sc.nextInt();

            int totalCalories = fu.calculateCalorie(activityName, durationInHours, intensityLevel, weight);

            System.out.println("The total calories burned " + totalCalories);

        }catch (InvalidException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("Error:Invalid activity data format.");
        }finally {
            System.out.println("Thank you for using Fitness Tracker Application.");
        }
    }
}
