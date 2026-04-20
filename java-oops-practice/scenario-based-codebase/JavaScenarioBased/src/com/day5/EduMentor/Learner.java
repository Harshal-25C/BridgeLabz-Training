package com.day5.EduMentor;

class Learner extends User implements ICertifiable{

 private double progressPercentage;

 Learner(String name, String email, int userId){
     super(name, email, userId);
 }

 //Setter with validation (Encapsulation)
 public void setProgress(double progressPercentage){
     if (progressPercentage >= 0 && progressPercentage<=100){
         this.progressPercentage = progressPercentage;
     }
 }

 //Polymorphic certificate generation
 @Override
 public void generateCertificate(){
     if(progressPercentage >= 40){
         System.out.println("Certificate Generated for Short Course Learner: " + name);
     }else{
         System.out.println("Course not completed. Certificate not generated.");
     }
 }
}
