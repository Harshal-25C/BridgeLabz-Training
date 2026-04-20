package com.encapsulationandpolymorphism.VehicleRental;
import java.util.*;

public class VehicleRentalSystem{
    public static void main(String[] args){

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("MH12A1234", 1500));
        vehicles.add(new Bike("MH14B5678", 500));
        vehicles.add(new Truck("MH10T9999", 3000));

        for(Vehicle v : vehicles){
            v.displayVehicle();
            System.out.println("Rental Cost (3 days): ₹" + v.calculateRentalCost(3));

            Insurable ins = (Insurable) v;
            System.out.println("Insurance Cost: ₹" + ins.calculateInsurance());
            System.out.println(ins.getInsuranceDetails());
            System.out.println("----------------------------");
        }
    }
}
