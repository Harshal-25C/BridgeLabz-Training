package com.day8.DigitalArtMarketplace;

class PrintArt extends Artwork{
    public PrintArt(String title, String artist, double price, String licenseType){
        super(title, artist, price, licenseType);
    }

    @Override
    public void license(User user){
        System.out.println("Print-only license issued for: " + title);
    }
}
