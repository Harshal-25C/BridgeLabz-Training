package com.streams;
import java.io.*;

public class FilterStreamUppercaseToLowercase{

    public static void main(String[] args) {

        String sourceFile = "src/com/streams/source.txt";
        String destinationFile = "output.txt";

        try(
            BufferedReader br = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))
        ) {
            int ch;
            while ((ch = br.read()) != -1) {
                bw.write(Character.toLowerCase((char) ch));
            }

            System.out.println("File converted from uppercase to lowercase successfully.");

        }catch(IOException e) {
            System.out.println("Error while processing text file.");
        }
    }
}
