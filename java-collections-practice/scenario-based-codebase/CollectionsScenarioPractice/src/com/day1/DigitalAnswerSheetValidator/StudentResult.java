package com.day1.DigitalAnswerSheetValidator;

public class StudentResult implements Comparable<StudentResult> {

    String studentName;
    int score;

    public StudentResult(String studentName, int score) {
        this.studentName = studentName;
        this.score = score;
    }

    @Override
    public int compareTo(StudentResult o) {
        return Integer.compare(o.score, this.score); // Descending
    }

    @Override
    public String toString() {
        return studentName + " → Score: " + score;
    }
}
