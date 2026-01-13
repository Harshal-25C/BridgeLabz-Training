package com.day9.MobileGameDistributionPlatform;

abstract class Game implements IDownloadable {

    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    public Game(String title, String genre, double price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    //Operator usage
    public void applyDiscount(double percent) {
        price = price-(price*percent/100);
    }
}
