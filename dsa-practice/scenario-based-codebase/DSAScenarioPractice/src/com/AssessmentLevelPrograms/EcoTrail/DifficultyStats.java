package com.AssessmentLevelPrograms.EcoTrail;

public class DifficultyStats {
    int count;
    int totalHikes;

    public DifficultyStats(int count, long totalHikes) {
        this.count = count;
        this.totalHikes = (int)totalHikes;
    }

    public double getAverage() {
        return (double) totalHikes/count;
    }
}

