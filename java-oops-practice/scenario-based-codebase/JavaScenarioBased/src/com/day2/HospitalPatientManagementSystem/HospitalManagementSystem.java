package com.day2.HospitalPatientManagementSystem;

public class HospitalManagementSystem {
	public static void main(String[] args) {
		//Doctor object
        Doctor d1 = new Doctor(201, "Dr. Anvii Patil", "Cardiology");
        Doctor d2 = new Doctor(202, "Dr. Harshal Choudhary", "Cardiology");
        d1.displayInfo();
        d2.displayInfo();

        System.out.println();

        //Patient objects using polymorphism
        Patient p1 = new InPatient(101, "Rahul", 45, "Heart Issue", 5, 3000);
        Patient p2 = new OutPatient(102, "Anita", 30, 800);

        p1.displayInfo();
        p2.displayInfo();

        System.out.println();

        //Billing using abstraction via interface
        Bill bill1 = new Bill(((InPatient) p1).getTreatmentCost());
        Bill bill2 = new Bill(((OutPatient) p2).getTreatmentCost());

        System.out.println("In-Patient Final Bill: ₹" + bill1.calculatePayment());
        System.out.println("Out-Patient Final Bill: ₹" + bill2.calculatePayment());
	}

}
