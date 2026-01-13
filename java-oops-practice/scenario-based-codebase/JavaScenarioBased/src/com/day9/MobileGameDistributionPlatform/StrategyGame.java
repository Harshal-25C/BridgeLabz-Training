package com.day9.MobileGameDistributionPlatform;

class StrategyGame extends Game {
	
    public StrategyGame(String title, double price) {
        super(title, "Strategy", price);
    }

    public void download() {
        System.out.println(title + " downloaded (Strategy)");
    }

    public void playDemo() {
        System.out.println("Playing tactical strategy demo");
    }
}
