package com.streams;
import java.io.*;

public class ReadLargeFileLineByLine {
	public static void main(String[] args) {

        String filePath = "src/com/streams/source.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while((line = br.readLine()) != null) {
                if(line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }

        }catch (IOException e) {
            System.out.println("Error while reading large file.");
        }
    }
}
