package com.day8.OnlineLearningPortal;

class Student extends User{
    private int completedModules;
    private double grade;

    public Student(String name, String email){
        super(name, email);
        this.completedModules=0;
        this.grade=0;
    }

    public void completeModule(){
        completedModules++;
    }

    public void setGrade(double grade){
        this.grade=grade;
    }

    public double getGrade() {
        return grade;
    }

    public int getCompletedModules() {
        return completedModules;
    }

    @Override
    public void printDetails() {
        System.out.println("Student: "+name+", Email: "+email);
    }
}
