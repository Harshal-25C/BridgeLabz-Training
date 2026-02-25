package com.AssessmentLevelPrograms.ExperimentManagementSystem;

import java.time.LocalDate;

public interface Experiment {

    public double calculateInnovationScore(int monthsActive);

    public double calculateResourceConsumption(int monthsActive);

    public default Experiment getHigherImpactExperiment(Experiment e1, Experiment e2) {
        if (((ExperimentInfo) e1).getFundingAmount() >
            ((ExperimentInfo) e2).getFundingAmount()) {
            return e1;
        } else {
            return e2;
        }
    }

    public static int getMonthsActive(int initiationMonth, int initiationYear) {

        LocalDate currentDate = LocalDate.now();

        int currentMonth = currentDate.getMonthValue();
        int currentYear = currentDate.getYear();

        return (currentYear - initiationYear) * 12 +
               (currentMonth - initiationMonth);
    }
}
