package com.MultiThreading;
import java.time.LocalTime;

class TaskRunner extends Thread {

    public TaskRunner(String name) {
        super(name);
    }

    @Override
    public void run() {
        try{
            Thread.sleep(2000); // TIMED_WAITING
            for(int i=0; i<1000000; i++); // RUNNABLE
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class StateMonitor extends Thread {

    private Thread[] threads;

    public StateMonitor(Thread... threads) {
        this.threads = threads;
    }

    @Override
    public void run() {
        boolean running = true;

        while(running) {
            running = false;

            for(Thread t:threads) {
                System.out.println("[Monitor] " + t.getName() +
                        " is in " + t.getState() +
                        " at " + LocalTime.now());
                if(t.getState() != Thread.State.TERMINATED) {
                    running = true;
                }
            }

            try{
                Thread.sleep(500);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Summary: All threads completed execution");
    }
}

public class ThreadStateDemo {
    public static void main(String[] args) {

        TaskRunner t1 = new TaskRunner("Task-1");
        TaskRunner t2 = new TaskRunner("Task-2");

        StateMonitor monitor = new StateMonitor(t1, t2);

        t1.start();
        t2.start();
        monitor.start();
    }
}
