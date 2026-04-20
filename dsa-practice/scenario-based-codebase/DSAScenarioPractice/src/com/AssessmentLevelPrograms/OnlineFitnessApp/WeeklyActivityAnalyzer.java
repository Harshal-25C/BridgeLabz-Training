package com.AssessmentLevelPrograms.OnlineFitnessApp;

import java.util.Scanner;

public class WeeklyActivityAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] steps = new int[7];  //Array to store 7 days step count

        System.out.println("Enter step count for 7 days:");

        // Input + Validation
        for(int i=0; i<7; i++) {
            try{
                System.out.print("Day " + (i + 1) + ": ");
                steps[i] = sc.nextInt();

                if(steps[i] <= 0 || steps[i] >= 100000) {
                    throw new InvalidStepCountException(
                            "Step count must be between 1 and 99,999."
                    );
                }

            }
            catch (InvalidStepCountException e) {
                System.out.println("Error: " + e.getMessage());
                i--; //repeat same day input
            }
            catch (Exception e) {
                System.out.println("Invalid input! Please enter numbers only.");
                sc.next(); //clear invalid input
                i--;
            }
        }

        // Calculations using for-each loop
        int total = 0;
        int highest = steps[0];
        int lowest = steps[0];

        for(int step : steps) {
            total += step;

            if(step > highest)
                highest = step;

            if(step < lowest)
                lowest = step;
        }

        double average = total/7.0;

        // Classification using if-else
        String activityLevel;

        if(average >= 10000) {
            activityLevel = "Active";
        }else if (average >= 5000) {
            activityLevel = "Moderate";
        }else {
            activityLevel = "Sedentary";
        }

        System.out.println("\n===== WEEKLY FITNESS REPORT =====");
        System.out.println("Total Weekly Steps  : " + total);
        System.out.println("Average Steps/Day   : " + average);
        System.out.println("Highest Step Count  : " + highest);
        System.out.println("Lowest Step Count   : " + lowest);
        System.out.println("Activity Level      : " + activityLevel);
        System.out.println("==================================");

        sc.close();
    }
}
