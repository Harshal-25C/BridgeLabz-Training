package com.mysqlScenarioPractice.PatientManagement;

public class PatientApp {
    public static void main(String[] args) {
        try{
            PatientDAO dao = new PatientDAO();

            Patient p = new Patient();
            p.setName("Rahul");
            p.setDob("1999-05-10");
            p.setPhone("9999999999");
            p.setEmail("rahul@gmail.com");
            p.setAddress("Pune");
            p.setBloodGroup("O+");

            dao.registerPatient(p);
            dao.searchPatientByName("Rahul");

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
