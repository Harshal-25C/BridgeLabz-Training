package com.day6.ParkEase;

public class ParkingSlot{
    private String slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;

    //Internal booking record (private)
    private String bookingLog;

    public ParkingSlot(String slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    //Slot availability controlled internally
    public boolean assignSlot(Vehicle vehicle){
        if (!isOccupied && vehicle.getClass().getSimpleName().equals(vehicleTypeAllowed)) {
            isOccupied = true;
            bookingLog="Vehicle " + vehicle.getVehicleNumber()+" parked in slot " + slotId;
            return true;
        }
        return false;
    }

    public void releaseSlot() {
        isOccupied = false;
        bookingLog +=" | Slot released";
    }

    public boolean isAvailable(){
        return !isOccupied;
    }

    //Logs exposed safely
    public String getBookingLog(){
        return bookingLog;
    }
}
