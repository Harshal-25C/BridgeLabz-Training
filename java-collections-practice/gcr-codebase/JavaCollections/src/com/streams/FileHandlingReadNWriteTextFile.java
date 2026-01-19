package com.streams;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlingReadNWriteTextFile {
	public static void main(String[] args) {

		String sourceFile = "src/com/streams/source.txt";
		String destFile = "src/com/streams/destination.txt";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(sourceFile); // may throw exception
            fos = new FileOutputStream(destFile);  // creates file if not exists

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            System.out.println("File copied successfully.");

        }catch (IOException e) {
            System.out.println("Source file does not exist or error occurred.");
        }finally {
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Error while closing files.");
            }
        }
    }
}
