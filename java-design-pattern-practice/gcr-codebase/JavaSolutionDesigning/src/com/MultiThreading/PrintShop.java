package com.MultiThreading;

class PrintJob implements Runnable {

    private String jobName;
    private int pages;

    public PrintJob(String jobName, int pages) {
        this.jobName = jobName;
        this.pages = pages;
    }

    @Override
    public void run() {
        for(int i=1; i<=pages; i++) {
            System.out.println("Printing " + jobName +
                    " - Page " + i + " of " + pages);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class PrintShop {
    public static void main(String[] args) throws InterruptedException {

        long start = System.currentTimeMillis();

        Thread j1 = new Thread(new PrintJob("Job1", 10));
        Thread j2 = new Thread(new PrintJob("Job2", 5));
        Thread j3 = new Thread(new PrintJob("Job3", 15));
        Thread j4 = new Thread(new PrintJob("Job4", 8));
        Thread j5 = new Thread(new PrintJob("Job5", 12));

        j1.setPriority(5);
        j2.setPriority(8);
        j3.setPriority(3);
        j4.setPriority(6);
        j5.setPriority(7);

        System.out.println("Starting print jobs...");
        j1.start(); j2.start(); j3.start(); j4.start(); j5.start();

        j1.join(); j2.join(); j3.join(); j4.join(); j5.join();

        long end = System.currentTimeMillis();
        System.out.println("All jobs completed in " + (end-start)+"ms");
    }
}
