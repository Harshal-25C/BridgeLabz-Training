package com.hashing.ImplementCustomHashMap;

public class CustomHashMapTest{
    public static void main(String[] args){
        MyHashMap map = new MyHashMap();

        map.put(1, 10);
        map.put(2, 20);
        map.put(12, 30); //collision

        System.out.println(map.get(1));  
        System.out.println(map.get(12)); 

        map.remove(2);
        System.out.println(map.get(2)); 
    }
}
