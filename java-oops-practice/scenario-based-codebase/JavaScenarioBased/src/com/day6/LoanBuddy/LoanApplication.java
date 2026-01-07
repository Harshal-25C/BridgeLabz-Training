package com.day6.LoanBuddy;
import java.util.*;

public abstract class LoanApplication implements IApprovable{

    protected String loanType;
    protected int term; // years
    protected double interestRate;

    private boolean approved;
    protected Applicant applicant;

    public LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
        this.approved = false;
    }

    protected double computeEMI(double principal) {
        double monthlyRate = (interestRate / 12) / 100;
        int months = term * 12;

        return (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);
    }

    public void setApproved(boolean status) {
        this.approved = status;
    }

    public boolean isApproved() {
        return approved;
    }

    @Override
    public abstract double calculateEMI();
}

