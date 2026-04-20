package com.day8.DigitalArtMarketplace;

abstract class Artwork implements IPurchasable{

    protected String title;
    protected String artist;
    protected double price;

    protected String licenseType;   //Protected encapsulated licensing terms
    protected boolean previewAvailable;

    //Constructor without preview
    public Artwork(String title, String artist, double price, String licenseType){
        this(title, artist, price, licenseType, false);
    }

    //Constructor with preview
    public Artwork(String title, String artist, double price, String licenseType, boolean previewAvailable){
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.previewAvailable = previewAvailable;
    }

    @Override
    public void purchase(User user){
        user.deductAmount(price);
        System.out.println(user.getName()+" purchased artwork: "+title);
    }

    @Override
    public abstract void license(User user);
}
