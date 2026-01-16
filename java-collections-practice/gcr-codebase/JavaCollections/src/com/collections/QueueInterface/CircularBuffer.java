package com.collections.QueueInterface;

public class CircularBuffer {

    private int[] buffer;
    private int front = 0, rear = 0, count = 0;
    private int size;

    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    public void insert(int value) {
        buffer[rear] = value;
        rear = (rear + 1) % size;

        if(count<size) {
            count++;
        }else {
            front = (front+1)%size;
        }
    }

    public void display() {
        for(int i=0; i<count; i++) {
            System.out.print(buffer[(front + i)%size] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);

        cb.display();
    }
}
