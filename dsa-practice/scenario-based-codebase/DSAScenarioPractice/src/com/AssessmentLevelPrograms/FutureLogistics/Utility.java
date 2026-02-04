package com.AssessmentLevelPrograms.FutureLogistics;

public class Utility {

    public boolean validateTransportId(String transportId) {
        return transportId.matches("RTS\\d{3}[A-Z]");
    }

    public GoodsTransport parseDetails(String input) {

        String[] data = input.split(":");

        String transportId = data[0];
        String transportDate = data[1];
        int rating = Integer.parseInt(data[2]);
        String transportType = data[3];

        if (transportType.equalsIgnoreCase("BrickTransport")) {
            return new BrickTransport(
                    transportId,
                    transportDate,
                    rating,
                    Float.parseFloat(data[4]),
                    Integer.parseInt(data[5]),
                    Float.parseFloat(data[6])
            );
        } else {
            return new TimberTransport(
                    transportId,
                    transportDate,
                    rating,
                    Float.parseFloat(data[4]),
                    Float.parseFloat(data[5]),
                    data[6],
                    Float.parseFloat(data[7])
            );
        }
    }

    public String findObjectType(GoodsTransport goodsTransport) {
        if (goodsTransport instanceof TimberTransport)
            return "TimberTransport";
        else
            return "BrickTransport";
    }
}
