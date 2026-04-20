package com.day5.EduMentor;

import java.util.*;

class Quiz{

 private List<String> questions;
 private List<String> correctAnswers;
 private int score;

 //Constructor for quiz with variable difficulty
 Quiz(List<String> questions, List<String> correctAnswers){
     this.questions = questions;
     this.correctAnswers = correctAnswers;
     this.score = 0;
 }

 public void attemptQuiz(List<String> userAnswers){

     for(int i=0; i<questions.size(); i++){

         if(userAnswers.get(i).equalsIgnoreCase(correctAnswers.get(i))){
             score += 10;
         }
     }
 }

 //Calculate percentage using operators
 public double calculatePercentage() {
     return (score * 100.0) / (questions.size() * 10);
 }

 public int getScore(){
     return score;
 }
}
