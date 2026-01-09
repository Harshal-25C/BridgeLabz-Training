package com.day8.DigitalArtMarketplace;

class DigitalArt extends Artwork {
    public DigitalArt(String title, String artist, double price, String licenseType, boolean previewAvailable) {
        super(title, artist, price, licenseType, previewAvailable);
    }

    @Override
    public void license(User user){
        System.out.println("Digital license granted ("+licenseType+") for: "+ title);
    }
}
