package com.day2.HospitalPatientManagementSystem;

public class Bill implements Payable{
	private double amount;
	private double taxRate;
	private double discountRate;
	
	public Bill(double amount) {
		// TODO Auto-generated constructor stub
		this.amount = amount;
	}

	public double calculatePayment() {
		double tax = amount*taxRate;
		double discount = amount*discountRate;
		return amount + tax-discount;
	}
}
