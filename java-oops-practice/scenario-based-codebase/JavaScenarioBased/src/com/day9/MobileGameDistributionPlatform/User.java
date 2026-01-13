package com.day9.MobileGameDistributionPlatform;

import java.util.*;

class User {

    private List<Game> ownedGames;

    public User() {
        ownedGames = new ArrayList<>();
    }

    public void purchaseGame(Game game) {
        ownedGames.add(game);
        System.out.println("Game purchased: " + game.title);
    }

    public void viewLibrary() {
        System.out.println("Owned Games:");
        for (Game g : ownedGames) {
            System.out.println("- " + g.title);
        }
    }
}
