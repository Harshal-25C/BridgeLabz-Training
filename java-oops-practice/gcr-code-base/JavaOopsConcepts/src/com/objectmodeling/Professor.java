package com.objectmodeling;

//Professor class
class Professor{
 String professorName;

 Professor(String professorName){
     this.professorName = professorName;
 }

 void assignProfessor(Course course){
     System.out.println(professorName + " is teaching " + course.courseName);
 }
}

