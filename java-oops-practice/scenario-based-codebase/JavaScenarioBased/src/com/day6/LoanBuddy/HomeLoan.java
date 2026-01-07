package com.day6.LoanBuddy;

public class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int term) {
        super(applicant, term, 8.5);
        this.loanType = "Home Loan";
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 700 &&
            applicant.getIncome() >= applicant.getLoanAmount() / 10) {

            setApproved(true);
            return true;
        }
        setApproved(false);
        return false;
    }

    @Override
    public double calculateEMI() {
        return computeEMI(applicant.getLoanAmount());
    }
}
