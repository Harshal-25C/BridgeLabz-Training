package com.AssessmentLevelPrograms.FutureLogistics;

public class TimberTransport extends GoodsTransport {

    private float timberLength;
    private float timberRadius;
    private String timberType;
    private float timberPrice;

    public TimberTransport(String transportId, String transportDate, int transportRating,
                           float timberLength, float timberRadius,
                           String timberType, float timberPrice) {
        super(transportId, transportDate, transportRating);
        this.timberLength = timberLength;
        this.timberRadius = timberRadius;
        this.timberType = timberType;
        this.timberPrice = timberPrice;
    }

    public float getTimberLength() {
        return timberLength;
    }

    public float getTimberRadius() {
        return timberRadius;
    }

    public String getTimberType() {
        return timberType;
    }

    public float getTimberPrice() {
        return timberPrice;
    }

    @Override
    public String vehicleSelection() {

        float area = 2 * 3.147f * timberRadius * timberLength;

        if (area < 250)
            return "Truck";
        else if (area <= 400)
            return "Lorry";
        else
            return "MonsterLorry";
    }

    @Override
    public float calculateTotalCharge() {

        float volume = 3.147f * timberRadius * timberRadius * timberLength;

        float rate = timberType.equalsIgnoreCase("Premium") ? 0.25f : 0.15f;
        float price = volume * timberPrice * rate;

        float tax = price * 0.30f;

        float discount = 0;
        if (transportRating == 5)
            discount = price * 0.20f;
        else if (transportRating == 3 || transportRating == 4)
            discount = price * 0.10f;

        float vehiclePrice;
        String vehicle = vehicleSelection().toLowerCase();

        if (vehicle.equals("truck"))
            vehiclePrice = 1000;
        else if (vehicle.equals("lorry"))
            vehiclePrice = 1700;
        else
            vehiclePrice = 3000;

        return (price + vehiclePrice + tax) - discount;
    }
}
