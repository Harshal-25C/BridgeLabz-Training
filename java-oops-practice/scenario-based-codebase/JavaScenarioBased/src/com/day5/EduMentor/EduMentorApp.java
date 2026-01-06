package com.day5.EduMentor;

import java.util.*;

public class EduMentorApp{

 public static void main(String[] args){

     //Creating instructor
     Instructor instructor = new Instructor(
             "Dr. Harshh", "harshal@edumentor.com", 101, "Full Stack Java"
     );

     instructor.displayInstructor();

     //Creating learner
     Learner learner = new Learner("Anvii", "anvii@edumentor.com", 201);

     //Quiz data
     List<String> questions = Arrays.asList(
             "What is Java?",
             "What is OOP?"
     );

     List<String> correctAnswers = Arrays.asList(
             "Programming Language",
             "Object Oriented Programming"
     );

     Quiz quiz = new Quiz(questions, correctAnswers);

     // Learner attempts quiz
     List<String> userAnswers = Arrays.asList(
             "Programming Language",
             "Object Oriented Programming"
     );

     quiz.attemptQuiz(userAnswers);

     double percentage = quiz.calculatePercentage();
     learner.setProgress(percentage);

     System.out.println("Quiz Score: " + quiz.getScore());
     System.out.println("Quiz Percentage: " + percentage + "%");

     //Certificate generation (Polymorphism)
     learner.generateCertificate();

     //Full-time learner
     FullTimeLearner ftLearner = new FullTimeLearner(
             "Ankit", "ankit@edumentor.com", 301
     );
     ftLearner.generateCertificate();
 }
}

