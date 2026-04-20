package com.day8.SortingStallsbyCustomerFootfall;

class Stall {
    String stallName;
    int footfall;

    Stall(String stallName, int footfall) {
        this.stallName = stallName;
        this.footfall = footfall;
    }

    @Override
    public String toString() {
        return stallName+" : "+footfall;
    }
}
