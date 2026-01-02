package com.day2.HospitalPatientManagementSystem;

public class InPatient extends Patient{
	private int daysAdmitted;
	private double daysCharge;
	
	public InPatient(int id, String name, int age, String history, int daysAdmitted, double daysCharge) {
		// TODO Auto-generated constructor stub
		super(id, name, age, history);
		this.daysAdmitted = daysAdmitted;
		this.daysCharge = daysCharge;
	}
	
	public double getTreatmentCost() {
		return daysAdmitted*daysCharge;
	}
	
	@Override
	public void displayInfo(){
        System.out.println("In-Patient -> "+getSummary());
    }
}
