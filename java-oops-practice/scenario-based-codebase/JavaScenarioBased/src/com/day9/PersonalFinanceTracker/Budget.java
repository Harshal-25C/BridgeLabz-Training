package com.day9.PersonalFinanceTracker;

import java.util.*;

abstract class Budget implements IAnalyzable{
    protected double income;
    protected Map<String, Double> categoryLimits;
    protected List<Transaction> transactions;

    public Budget(double income, Map<String, Double> categoryLimits) {
        this.income = income;
        this.categoryLimits = categoryLimits;
        this.transactions = new ArrayList<>();
    }

    //Encapsulation: controlled addition only
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    protected double calculateTotalExpenses() {
        double total = 0;
        for(Transaction t:transactions) {
            if(t.getType().equals("EXPENSE")) {
                total+=t.getAmount();
            }
        }
        return total;
    }

    public double calculateNetSavings() {
        return income-calculateTotalExpenses();
    }
}
