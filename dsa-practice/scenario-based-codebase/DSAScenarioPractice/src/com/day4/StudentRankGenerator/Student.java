package com.day4.StudentRankGenerator;

public class Student {
    private int rollNo;
    private int score;

    public Student(int rollNo, int score) {
        this.rollNo = rollNo;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public String toString() {
        return "Roll: "+rollNo+" | Score: "+score;
    }
}
