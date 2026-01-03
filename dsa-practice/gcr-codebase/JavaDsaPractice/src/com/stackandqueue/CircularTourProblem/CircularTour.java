package com.stackandqueue.CircularTourProblem;

public class CircularTour{
    public static int findStart(PetrolPump[] pumps){
        int start = 0;
        int surplus = 0;
        int deficit = 0;

        for (int i=0; i<pumps.length; i++) {
            surplus += pumps[i].petrol - pumps[i].distance;

            if(surplus<0){
                deficit+=surplus;
                surplus =0;
                start = i+1;
            }
        }

        return (surplus+deficit>=0) ? start : -1;
    }

    public static void main(String[] args){
        PetrolPump[] pumps = {
            new PetrolPump(6, 4),
            new PetrolPump(3, 6),
            new PetrolPump(7, 3)
        };

        int startIndex = findStart(pumps);

        System.out.println("Start Pump Index: " + startIndex);
    }
}
