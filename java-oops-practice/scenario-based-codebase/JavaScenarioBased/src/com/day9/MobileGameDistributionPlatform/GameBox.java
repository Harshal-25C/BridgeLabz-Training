package com.day9.MobileGameDistributionPlatform;

public class GameBox {
    public static void main(String[] args) {

        Game g1 = new ArcadeGame("Speed Rush", 299);
        Game g2 = new StrategyGame("War Tactics", 499);

        g1.playDemo();
        g2.playDemo();

        g2.applyDiscount(20);

        User user = new User();
        user.purchaseGame(g1);
        user.purchaseGame(g2);

        user.viewLibrary();
    }
}
