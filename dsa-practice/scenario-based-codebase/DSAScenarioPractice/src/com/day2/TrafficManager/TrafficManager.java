package com.day2.TrafficManager;

import java.util.LinkedList;
import java.util.Queue;

public class TrafficManager {

    private VehicleNode head = null;
    private VehicleNode tail = null;

    private Queue<String> waitingQueue;
    private int maxQueueSize;

    public TrafficManager(int maxQueueSize) {
        this.maxQueueSize = maxQueueSize;
        waitingQueue = new LinkedList<>();
    }

    //Vehicle arrives at roundabout
    public void addVehicle(String vehicleNumber) {

        if(head == null){
            VehicleNode newNode = new VehicleNode(vehicleNumber);
            head = tail = newNode;
            tail.next = head;
            System.out.println(vehicleNumber + " entered roundabout");
            return;
        }

        //Otherwise, send to waiting queue
        if(waitingQueue.size() == maxQueueSize) {
            System.out.println("Queue Overflow! "+vehicleNumber+" cannot enter now");
        }else {
            waitingQueue.offer(vehicleNumber);
            System.out.println(vehicleNumber+" added to waiting queue");
        }
    }

    //Vehicle exits roundabout
    public void removeVehicle(String vehicleNumber) {

        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }

        VehicleNode current = head;
        VehicleNode previous = tail;

        do {
            if(current.vehicleNumber.equals(vehicleNumber)) {

                if(current == head && current == tail) {
                    head = tail = null;
                }else {
                    if(current == head) {
                        head = head.next;
                        tail.next = head;
                    }else if (current == tail) {
                        tail = previous;
                        tail.next = head;
                    }else {
                        previous.next = current.next;
                    }
                }

                System.out.println(vehicleNumber + " exited roundabout");
                moveFromQueue();
                return;
            }

            previous = current;
            current = current.next;

        } while (current != head);

        System.out.println(vehicleNumber + " not found in roundabout");
    }

    // Move vehicle from queue to roundabout
    private void moveFromQueue() {
        if (!waitingQueue.isEmpty()) {
            String nextVehicle = waitingQueue.poll();
            addDirectly(nextVehicle);
            System.out.println(nextVehicle + " moved from queue to roundabout");
        }
    }

    private void addDirectly(String vehicleNumber) {
        VehicleNode newNode = new VehicleNode(vehicleNumber);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void printRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        System.out.print("Roundabout: ");
        VehicleNode temp = head;
        do {
            System.out.print(temp.vehicleNumber + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to " + head.vehicleNumber + ")");
    }
}
