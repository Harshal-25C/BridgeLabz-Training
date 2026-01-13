package com.day3.OnlineExamReviewSystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ExamProctor {

    private Stack<Integer> navigationStack;         
    private Map<Integer, String> answerSheet;         
    private Map<Integer, String> correctAnswers;  

    public ExamProctor(){
        navigationStack = new Stack<>();
        answerSheet = new HashMap<>();
        correctAnswers = new HashMap<>();

        //Sample answer key
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
        correctAnswers.put(4, "D");
    }

    //Visit a question
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    //Save or update answer
    public void submitAnswer(int questionId, String answer) {
        answerSheet.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }

    //Go back to previous question
    public void goBack() {
        if(navigationStack.isEmpty()) {
            System.out.println("No previous question");
            return;
        }
        navigationStack.pop();
        if(!navigationStack.isEmpty()) {
            System.out.println("Back to Question: " + navigationStack.peek());
        }
    }

    //Function to evaluate score
    public int calculateScore() {
        int score = 0;

        for (Map.Entry<Integer, String> entry : answerSheet.entrySet()) {
            int questionId = entry.getKey();
            String answer = entry.getValue();

            if (answer.equals(correctAnswers.get(questionId))) {
                score++;
            }
        }
        return score;
    }

    //Submit exam
    public void submitExam() {
        int finalScore = calculateScore();
        System.out.println("Exam submitted. Final Score: " + finalScore);
    }
}
