package com.day2.HospitalPatientManagementSystem;

public class OutPatient extends Patient{
	private double consultationFee;
	
	public OutPatient(int id, String name, int age, double fee) {
		super(id, name, age);
		this.consultationFee = fee;
	}
	
	public double getTreatmentCost() {
		return consultationFee;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Out-Patient -> "+getSummary());
	}
}
