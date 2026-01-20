package com.exceptions;
import java.util.*;

//Custom Exception
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class CustomExceptionExample {

 //Method to validate age
 public static void validateAge(int age) throws InvalidAgeException {
     if(age < 18) {
         throw new InvalidAgeException("Age must be 18 or above");
     }
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     try{
         System.out.print("Enter your age: ");
         int age = sc.nextInt();

         validateAge(age);
         System.out.println("Access granted!");

     }catch (InvalidAgeException e) {
         System.out.println(e.getMessage());

     }finally {
         sc.close();
     }
 }
}
