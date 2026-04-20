package com.day9.MobileGameDistributionPlatform;

class ArcadeGame extends Game {
    public ArcadeGame(String title, double price) {
        super(title, "Arcade", price);
    }

    public void download() {
        System.out.println(title+" downloaded (Arcade)");
    }

    public void playDemo() {
        System.out.println("Playing fast-paced arcade demo");
    }
}
