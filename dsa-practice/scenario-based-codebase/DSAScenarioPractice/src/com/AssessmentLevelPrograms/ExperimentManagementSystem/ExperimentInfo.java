package com.AssessmentLevelPrograms.ExperimentManagementSystem;
public class ExperimentInfo implements Experiment {

    private int experimentId;
    private String experimentTitle;
    private String leadResearcher;
    private double fundingAmount;
    private String complexityLevel;
    private int initiationMonth;
    private int initiationYear;

    // 7-argument constructor
    public ExperimentInfo(int experimentId, String experimentTitle,
                          String leadResearcher, double fundingAmount,
                          String complexityLevel,
                          int initiationMonth, int initiationYear) {

        this.experimentId = experimentId;
        this.experimentTitle = experimentTitle;
        this.leadResearcher = leadResearcher;
        this.fundingAmount = fundingAmount;
        this.complexityLevel = complexityLevel;
        this.initiationMonth = initiationMonth;
        this.initiationYear = initiationYear;
    }

    // Getters and Setters

    public int getExperimentId() {
        return experimentId;
    }

    public void setExperimentId(int experimentId) {
        this.experimentId = experimentId;
    }

    public String getExperimentTitle() {
        return experimentTitle;
    }

    public void setExperimentTitle(String experimentTitle) {
        this.experimentTitle = experimentTitle;
    }

    public String getLeadResearcher() {
        return leadResearcher;
    }

    public void setLeadResearcher(String leadResearcher) {
        this.leadResearcher = leadResearcher;
    }

    public double getFundingAmount() {
        return fundingAmount;
    }

    public void setFundingAmount(double fundingAmount) {
        this.fundingAmount = fundingAmount;
    }

    public String getComplexityLevel() {
        return complexityLevel;
    }

    public void setComplexityLevel(String complexityLevel) {
        this.complexityLevel = complexityLevel;
    }

    public int getInitiationMonth() {
        return initiationMonth;
    }

    public void setInitiationMonth(int initiationMonth) {
        this.initiationMonth = initiationMonth;
    }

    public int getInitiationYear() {
        return initiationYear;
    }

    public void setInitiationYear(int initiationYear) {
        this.initiationYear = initiationYear;
    }

    // =============================
    // Innovation Score Calculation
    // =============================

    @Override
    public double calculateInnovationScore(int monthsActive) {

        double multiplier = 0;

        switch (complexityLevel) {
            case "QubitOpt":
                multiplier = 1.5;
                break;
            case "Entanglement":
                multiplier = 2.5;
                break;
            case "Cryptography":
                multiplier = 3.5;
                break;
        }

        return (multiplier * monthsActive * fundingAmount) / 1000;
    }

    // =============================
    // Resource Consumption
    // =============================

    @Override
    public double calculateResourceConsumption(int monthsActive) {

        double consumptionRate = 0;

        switch (complexityLevel) {
            case "QubitOpt":
                consumptionRate = 0.8;
                break;
            case "Entanglement":
                consumptionRate = 1.2;
                break;
            case "Cryptography":
                consumptionRate = 1.8;
                break;
        }

        double result = (monthsActive * consumptionRate * fundingAmount) / 100;

        return Math.round(result * 10.0) / 10.0; // rounded to 1 decimal
    }

	public Experiment getHigherImpactExperiment(ExperimentInfo exp1, ExperimentInfo exp2) {
		// TODO Auto-generated method stub
		return null;
	}
}