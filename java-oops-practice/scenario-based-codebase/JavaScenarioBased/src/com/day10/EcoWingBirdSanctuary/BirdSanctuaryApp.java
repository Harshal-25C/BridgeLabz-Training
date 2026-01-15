package com.day10.EcoWingBirdSanctuary;

public class BirdSanctuaryApp {

    public static void main(String[] args) {

        BirdSanctuary sanctuary = new BirdSanctuary();

        sanctuary.addBird(new Eagle("B101", "Majestic"));
        sanctuary.addBird(new Duck("B102", "Donald"));
        sanctuary.addBird(new Penguin("B103", "Pingu"));
        sanctuary.addBird(new Kiwi("B104", "Kiko"));

        sanctuary.displayAllBirds();
        sanctuary.displayFlyingBirds();
        sanctuary.displaySwimmingBirds();
        sanctuary.sanctuaryReport();
    }
}
