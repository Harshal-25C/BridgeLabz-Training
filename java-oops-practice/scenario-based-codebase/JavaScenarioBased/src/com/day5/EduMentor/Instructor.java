package com.day5.EduMentor;
class Instructor extends User{

 private String specialization;

 Instructor(String name, String email, int userId, String specialization){
     super(name, email, userId);
     this.specialization = specialization;
 }

 void displayInstructor(){
     displayUser();
     System.out.println("Specialization: " + specialization);
 }
}
