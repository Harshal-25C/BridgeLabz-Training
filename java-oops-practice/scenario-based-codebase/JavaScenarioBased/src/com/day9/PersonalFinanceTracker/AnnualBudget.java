package com.day9.PersonalFinanceTracker;
import java.util.*;

class AnnualBudget extends Budget {

    public AnnualBudget(double income, Map<String, Double> categoryLimits) {
        super(income, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("Annual Budget Summary");
        System.out.println("Annual Savings: " + calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        System.out.println("Annual overspending analysis completed");
    }
}
