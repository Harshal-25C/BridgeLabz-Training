package com.day6.SortingFlavorsbyPopularity;

class Flavor {
    String name;
    int sales;

    Flavor(String name, int sales) {
        this.name = name;
        this.sales = sales;
    }

    @Override
    public String toString() {
        return name+" ("+sales+")";
    }
}
