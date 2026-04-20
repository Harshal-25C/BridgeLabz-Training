package com.hashing.ImplementCustomHashMap;

class MyHashMap{

    //Node class
    static class Node{
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 10;
    private Node[] table;

    public MyHashMap(){
        table = new Node[SIZE];
    }

    private int hash(int key){
        return key % SIZE;
    }

    //Insert or Update
    public void put(int key, int value){
        int index = hash(key);
        Node head = table[index];

        while(head != null){
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = table[index];
        table[index] = newNode;
    }

    //Retrieve
    public int get(int key) {
        int index = hash(key);
        Node head = table[index];

        while (head != null) {
            if (head.key == key)
                return head.value;
            head = head.next;
        }
        return -1; // not found
    }

    //Remove
    public void remove(int key){
        int index = hash(key);
        Node head = table[index];
        Node prev = null;

        while(head != null){
            if(head.key==key){
                if(prev == null)
                    table[index] = head.next;
                else
                    prev.next = head.next;
                return;
            }
            prev = head;
            head = head.next;
        }
    }
}
