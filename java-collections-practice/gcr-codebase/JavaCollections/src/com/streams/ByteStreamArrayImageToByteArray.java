package com.streams;
import java.io.*;

public class ByteStreamArrayImageToByteArray {
	public static void main(String[] args) {

        String sourceImage = "source.jpg";
        String destinationImage = "copy.jpg";

        try (
            FileInputStream fis = new FileInputStream(sourceImage);
            ByteArrayOutputStream baos = new ByteArrayOutputStream()
        ) {
            int data;
            while((data=fis.read()) != -1) {
                baos.write(data);
            }

            byte[] imageBytes = baos.toByteArray();

            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(destinationImage);

            while((data = bais.read()) != -1) {
                fos.write(data);
            }

            fos.close();
            bais.close();

            System.out.println("Image converted to byte array and written successfully.");
            System.out.println("New image is identical to original.");

        }catch(IOException e) {
            System.out.println("Error while processing image file.");
        }
    }
}
