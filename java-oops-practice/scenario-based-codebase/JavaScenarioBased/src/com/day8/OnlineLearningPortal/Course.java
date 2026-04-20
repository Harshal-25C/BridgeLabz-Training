package com.day8.OnlineLearningPortal;

class Course implements ICertifiable{
    private String title;
    private Instructor instructor;
    private String[] modules;

    private double rating;   //encapsulated
    private final String[] reviews;  //read-only internally

    public Course(String title, Instructor instructor){
        this(title, instructor, new String[]{"Introduction", "Basics"});
    }

    public Course(String title, Instructor instructor, String[] modules) {
        this.title=title;
        this.instructor=instructor;
        this.modules=modules;
        this.rating=0.0;
        this.reviews=new String[]{"Good", "Excellent"};
    }

    //Protected rating logic
    protected void updateRating(double newRating) {
        if(newRating>=0 && newRating<=5) {
            rating = (rating+newRating)/2; //operator usage
        }
    }

    public double getRating() {
        return rating;
    }

    public int getTotalModules() {
        return modules.length;
    }

    // Polymorphic certificate generation
    @Override
    public void generateCertificate(Student student) {
        double progress = (student.getCompletedModules()*100.0)/modules.length;

        if(progress==100 && student.getGrade()>=60) {
            System.out.println("Certificate Generated for "+student.name);
            System.out.println("Course: "+title);
            System.out.println("Grade: "+student.getGrade());
        }else{
            System.out.println("Certificate not eligible yet.");
        }
    }
}
