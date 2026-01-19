package com.streams;
import java.io.*;

public class StudentDataStreamApp {

    public static void main(String[] args) {

        String fileName = "studentData.dat";

        // Writing primitive data
        try(DataOutputStream dos =new DataOutputStream(new FileOutputStream(fileName))) {

            dos.writeInt(101);          // Roll Number
            dos.writeUTF("Harshal");    // Name
            dos.writeDouble(8.75);      // GPA

            System.out.println("Student data written successfully.");

        }catch(IOException e) {
            System.out.println("Error while writing data.");
        }

        //Reading primitive data
        try(DataInputStream dis =new DataInputStream(new FileInputStream(fileName))) {

            int rollNo = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("\nRetrieved Student Data:");
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name: " + name);
            System.out.println("GPA: " + gpa);

        }catch (IOException e) {
            System.out.println("Error while reading data.");
        }
    }
}
