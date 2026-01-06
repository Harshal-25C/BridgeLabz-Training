package com.BufferedReader.ChallengeProblems;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileReaderVsInputStreamReader {
    public static void main(String[] args) {

        String filePath = "largefile.txt";

        countUsingFileReader(filePath);
        System.out.println("----------------------------------");
        countUsingInputStreamReader(filePath);
    }

    //Using FileReader
    public static void countUsingFileReader(String filePath) {
        int wordCount = 0;
        long startTime = System.nanoTime();

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){

            String line;
            while((line = br.readLine()) != null){
                if(!line.trim().isEmpty()){
                    wordCount += line.trim().split("\\s+").length;
                }
            }

        }catch(IOException e){
            System.out.println("FileReader Error: " + e.getMessage());
            return;
        }

        long endTime = System.nanoTime();

        System.out.println("FileReader Results:");
        System.out.println("Word Count = " + wordCount);
        System.out.println("Time Taken (ms) = " + (endTime - startTime) / 1_000_000);
    }

    //Using InputStreamReader
    public static void countUsingInputStreamReader(String filePath) {
        int wordCount = 0;
        long startTime = System.nanoTime();

        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath),
                        StandardCharsets.UTF_8))) {

            String line;
            while((line = br.readLine()) != null){
                if(!line.trim().isEmpty()){
                    wordCount += line.trim().split("\\s+").length;
                }
            }

        }catch(IOException e){
            System.out.println("InputStreamReader Error: " + e.getMessage());
            return;
        }

        long endTime = System.nanoTime();

        System.out.println("InputStreamReader Results:");
        System.out.println("Word Count = " + wordCount);
        System.out.println("Time Taken (ms) = " + (endTime - startTime) / 1_000_000);
    }
}
