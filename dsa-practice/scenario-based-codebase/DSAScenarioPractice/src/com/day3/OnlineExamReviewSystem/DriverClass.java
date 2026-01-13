package com.day3.OnlineExamReviewSystem;

public class DriverClass {
    public static void main(String[] args) {

        ExamProctor exam = new ExamProctor();

        exam.visitQuestion(1);
        exam.submitAnswer(1, "A");

        exam.visitQuestion(2);
        exam.submitAnswer(2, "C");

        exam.goBack();

        exam.visitQuestion(3);
        exam.submitAnswer(3, "C");

        exam.submitExam();
    }
}
