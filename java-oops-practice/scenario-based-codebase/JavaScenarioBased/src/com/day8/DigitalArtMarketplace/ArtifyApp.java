package com.day8.DigitalArtMarketplace;

public class ArtifyApp{
    public static void main(String[] args){

        User buyer = new User("Harshal", 5000);

        Artwork digitalArt = new DigitalArt(
                "Cyber Dreams", "A. Verma", 1500,
                "Commercial Use", true
        );

        Artwork printArt = new PrintArt(
                "Nature Sketch", "R. Mehta", 1000,
                "Personal Use"
        );

        digitalArt.purchase(buyer);
        digitalArt.license(buyer);

        System.out.println("Remaining Wallet Balance: ₹" + buyer.getWalletBalance());
        System.out.println();

        printArt.purchase(buyer);
        printArt.license(buyer);

        System.out.println("Remaining Wallet Balance: ₹" + buyer.getWalletBalance());
    }
}
