package com.MultiThreading;

import java.util.Random;

class FileDownloaderRunnable implements Runnable {

    private String fileName;
    private Random random = new Random();

    public FileDownloaderRunnable(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        for(int i=0; i<=100; i += 25) {
            System.out.println("[" + Thread.currentThread().getName() +
            		"] Downloading " + fileName + ": " + i + "%");
            try{
                Thread.sleep(500 + random.nextInt(500));
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
