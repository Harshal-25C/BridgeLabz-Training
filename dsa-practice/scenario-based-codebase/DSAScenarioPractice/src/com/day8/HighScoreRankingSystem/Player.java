package com.day8.HighScoreRankingSystem;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name+" : "+score;
    }
}
