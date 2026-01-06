package com.day5.EduMentor;

import java.util.*;

class FullTimeLearner extends Learner{

 FullTimeLearner(String name, String email, int userId) {
     super(name, email, userId);
 }

 // Polymorphism: different certificate logic
 @Override
 public void generateCertificate() {
     System.out.println("Certificate Generated for Full-Time Program Learner.");
 }
}
