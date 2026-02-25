package com.AssessmentLevelPrograms.ExperimentManagementSystem;

import java.util.*;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Experiment 1 details:");
        int id1 = sc.nextInt();
        sc.nextLine();
        String title1 = sc.nextLine();
        String researcher1 = sc.nextLine();
        double funding1 = sc.nextDouble();
        sc.nextLine();
        String complexity1 = sc.nextLine();
        int month1 = sc.nextInt();
        int year1 = sc.nextInt();

        ExperimentInfo exp1 = new ExperimentInfo(id1, title1, researcher1,
                funding1, complexity1, month1, year1);

        System.out.println("Enter Experiment 2 details:");
        int id2 = sc.nextInt();
        sc.nextLine();
        String title2 = sc.nextLine();
        String researcher2 = sc.nextLine();
        double funding2 = sc.nextDouble();
        sc.nextLine();
        String complexity2 = sc.nextLine();
        int month2 = sc.nextInt();
        int year2 = sc.nextInt();

        ExperimentInfo exp2 = new ExperimentInfo(id2, title2, researcher2,
                funding2, complexity2, month2, year2);

        // Months Active
        int months1 = Experiment.getMonthsActive(month1, year1);
        int months2 = Experiment.getMonthsActive(month2, year2);

        // Calculations
        double innovation1 = exp1.calculateInnovationScore(months1);
        double resource1 = exp1.calculateResourceConsumption(months1);

        double innovation2 = exp2.calculateInnovationScore(months2);
        double resource2 = exp2.calculateResourceConsumption(months2);

        // Higher Impact
        Experiment higher = exp1.getHigherImpactExperiment(exp1, exp2);

        System.out.println("\nExperiment Summary:");

        System.out.println(exp1.getExperimentTitle() + " by " + exp1.getLeadResearcher());
        System.out.println("Months Active: " + months1);
        System.out.println("Innovation Score: " + innovation1);
        System.out.println("Resource Consumption: " + resource1);

        System.out.println(exp2.getExperimentTitle() + " by " + exp2.getLeadResearcher());
        System.out.println("Months Active: " + months2);
        System.out.println("Innovation Score: " + innovation2);
        System.out.println("Resource Consumption: " + resource2);

        System.out.println("Higher Impact Experiment: " +
                ((ExperimentInfo) higher).getExperimentTitle());

    }
}