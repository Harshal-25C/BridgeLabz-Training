package com.day2.CallCenter;

import java.util.*;

public class CallCenter {

    private Queue<Customer> normalQueue;
    private PriorityQueue<Customer> vipQueue;
    private HashMap<Integer, Integer> callFrequency;

    public CallCenter() {
        normalQueue = new LinkedList<>();
        vipQueue = new PriorityQueue<>((c1, c2) -> Integer.compare(c1.customerId, c2.customerId) );
        callFrequency = new HashMap<>();
    }

    //Incoming call
    public void receiveCall(Customer customer) {

        callFrequency.put(
            customer.customerId,
            callFrequency.getOrDefault(customer.customerId, 0) + 1
        );

        if(customer.isVIP) {
            vipQueue.offer(customer);
            System.out.println("VIP customer queued: "+customer.name);
        }else{
            normalQueue.offer(customer);
            System.out.println("Normal customer queued: "+customer.name);
        }
    }

    public void serveCustomer(){
        if(!vipQueue.isEmpty()){
            Customer c = vipQueue.poll();
            System.out.println("Serving VIP customer: "+c.name);
        }else if (!normalQueue.isEmpty()){
            Customer c = normalQueue.poll();
            System.out.println("Serving normal customer: "+c.name);
        }else {
            System.out.println("No calls in queue");
        }
    }

    public void displayCallStats() {
        System.out.println("Monthly Call Frequency:");
        for(Map.Entry<Integer, Integer> entry : callFrequency.entrySet()) {
            System.out.println("Customer ID "+entry.getKey()+" → "+entry.getValue()+" calls");
        }
    }
}
