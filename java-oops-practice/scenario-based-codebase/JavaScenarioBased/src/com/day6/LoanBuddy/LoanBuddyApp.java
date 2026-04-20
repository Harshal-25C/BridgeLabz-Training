package com.day6.LoanBuddy;

public class LoanBuddyApp{
    public static void main(String[] args) {
    	// TODO Auto-generated constructor stub
        Applicant applicant = new Applicant(
                "Mr. Harshal Choudhary", 720, 90000, 500000);

        LoanApplication loan = new HomeLoan(applicant, 20); 

        if(loan.approveLoan()) {
            System.out.println("Loan Approved for " + applicant.getName());
            System.out.println("Monthly EMI: ₹" +
                    String.format("%.2f", loan.calculateEMI()));
        }else{
            System.out.println("Loan Rejected for " + applicant.getName());
        }
    }
}
