package com.BufferedReader.FileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine{
    public static void main(String[] args){

        String filePath = "Sample.txt"; //File must exist in project folder

        try{
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String line;

            //Read file line by line
            while((line = br.readLine()) != null){
                System.out.println(line);
            }

            br.close();
            fr.close();

        }catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
