package com.streams;
import java.io.*;

public class BufferedVsUnbuffered {

    private static final int BUFFER_SIZE = 4096; // 4 KB

    public static void main(String[] args) {

        String source = "largefile.dat";
        String unbufferedDest = "copy_unbuffered.dat";
        String bufferedDest = "copy_buffered.dat";

        copyUsingFileStreams(source, unbufferedDest);
        copyUsingBufferedStreams(source, bufferedDest);
    }

    //Unbuffered File Copy
    private static void copyUsingFileStreams(String source, String dest) {
        long startTime = System.nanoTime();

        try(
            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(dest)
        ) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            long endTime = System.nanoTime();
            System.out.println("Unbuffered Time: "+(endTime-startTime)/1_000_000 + " ms");

        }catch (IOException e) {
            System.out.println("Error in unbuffered copy.");
        }
    }

    //Buffered File Copy
    private static void copyUsingBufferedStreams(String source, String dest) {
        long startTime = System.nanoTime();

        try(
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))
        ) {
            byte[] buffer=new byte[BUFFER_SIZE];
            int bytesRead;

            while((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            long endTime = System.nanoTime();
            System.out.println("Buffered Time: " + (endTime-startTime)/1_000_000 +" ms");

        }catch (IOException e) {
            System.out.println("Error in buffered copy.");
        }
    }
}
