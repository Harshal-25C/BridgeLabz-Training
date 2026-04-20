package com.day6.LoanBuddy;

public class Applicant {
	private String name;
	private int creditScore;
	private double income;
	private double loanAmount;

	public Applicant(String name, int creditScore, double income, double loanAmount) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.creditScore = creditScore;
		this.income = income;
		this.loanAmount = loanAmount;
	}
	
	public int getCreditScore() {
		return creditScore;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public double getIncome() {
		return income;
	}
	public String getName() {
		return name;
	}
}
