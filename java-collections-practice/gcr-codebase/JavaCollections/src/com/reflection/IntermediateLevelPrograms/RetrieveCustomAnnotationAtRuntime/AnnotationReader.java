package com.reflection.IntermediateLevelPrograms.RetrieveCustomAnnotationAtRuntime;

public class AnnotationReader {
    public static void main(String[] args) {

        Class<AnnotationDemo> clazz = AnnotationDemo.class;

        if(clazz.isAnnotationPresent(Author.class)) {
            Author author = clazz.getAnnotation(Author.class);
            System.out.println("Author Name: " + author.name());
        }
    }
}
