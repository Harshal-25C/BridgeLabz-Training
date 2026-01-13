package com.day9.PersonalFinanceTracker;
import java.util.*;

class MonthlyBudget extends Budget{

    public MonthlyBudget(double income, Map<String, Double> categoryLimits) {
        super(income, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("Monthly Budget Report");
        System.out.println("Net Savings: "+calculateNetSavings());
    }

    @Override
    public void detectOverspend() {
        Map<String, Double> spent = new HashMap<>();

        for(Transaction t : transactions) {
            if(t.getType().equals("EXPENSE")) {
                spent.put(
                    t.getCategory(),
                    spent.getOrDefault(t.getCategory(), 0.0)+t.getAmount()
                );
            }
        }

        for(String category:spent.keySet()) {
            if(spent.get(category)>categoryLimits.get(category)) {
                System.out.println("Overspending in: "+category);
            }
        }
    }
}
