package com.streams;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputToFileFromConsole {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fw = null;

        try{
            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(br.readLine());

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            fw = new FileWriter("userDetails.txt");

            fw.write("Name: "+name+"\n");
            fw.write("Age: " +age+"\n");
            fw.write("Favorite Language: " + language + "\n");

            System.out.println("User details saved successfully.");

        }catch (IOException e) {
            System.out.println("Input/Output error occurred.");
        }catch (NumberFormatException e) {
            System.out.println("Invalid age entered.");
        }finally {
            try{
                if (fw != null) fw.close();
                br.close();
            }catch (IOException e) {
                System.out.println("Error while closing resources.");
            }
        }
    }
}
