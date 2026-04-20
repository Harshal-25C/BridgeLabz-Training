package com.constructorandaccessmodifiers.levelone;

public class VehicleRegistration{

	//Instance variables
    String ownerName;
    String vehicleType;

    //Class variable (common for all vehicles)
    static double registrationFee = 500.0;

    //Parameterized constructor
    VehicleRegistration(String ownerName, String vehicleType){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    //Instance method: displays vehicle details
    void displayVehicleDetails(){
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
        System.out.println("---------------------------");
    }

    //Class method: updates registration fee for all vehicles
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args){
        //Creating vehicle objects
    	VehicleRegistration v1 = new VehicleRegistration("Harsh", "Car");
    	VehicleRegistration v2 = new VehicleRegistration("John", "Bike");

        //Displaying vehicle details
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        //Updating registration fee for all vehicles
        VehicleRegistration.updateRegistrationFee(750.0);

        //Displaying details again to see updated registration fee
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }

}
