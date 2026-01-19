package com.streams;
import java.io.*;

public class PipedStreamApp_InterThreadCommunication {
	public static void main(String[] args) {

        try{
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            //Writer Thread
            Thread writer = new Thread(() -> {
                try{
                    String message = "Hello from Writer Thread";
                    pos.write(message.getBytes());
                    pos.close();
                }catch(IOException e) {
                    System.out.println("Writer error.");
                }
            });

            //Reader Thread
            Thread reader = new Thread(() -> {
                try{
                    int data;
                    while((data = pis.read()) != -1) {
                        System.out.print((char) data);
                    }
                    pis.close();
                }catch (IOException e) {
                    System.out.println("Reader error.");
                }
            });

            writer.start();
            reader.start();

        }catch (IOException e) {
            System.out.println("Piped stream error.");
        }
    }
}
