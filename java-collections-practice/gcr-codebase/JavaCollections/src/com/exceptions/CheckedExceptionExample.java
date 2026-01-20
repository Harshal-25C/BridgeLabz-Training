package com.exceptions;
import java.io.*;

//Compile-time Exception
public class CheckedExceptionExample {

    public static void main(String[] args) {
        String fileName = "data.txt";

        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        }catch(IOException e) {
            System.out.println("File not found");
        }
    }
}
