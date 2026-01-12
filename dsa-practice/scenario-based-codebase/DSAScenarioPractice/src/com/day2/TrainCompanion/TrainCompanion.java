package com.day2.TrainCompanion;

public class TrainCompanion {
	
    private Compartment head;
    private Compartment tail;
    private Compartment current;

    //Add compartment at end
    public void addCompartment(String name, boolean pantry, boolean wifi) {
        Compartment newCompartment = new Compartment(name, pantry, wifi);

        if(head==null) {
            head=tail=current=newCompartment;
        }else{
            tail.next = newCompartment;
            newCompartment.prev = tail;
            tail = newCompartment;
        }
    }

    //Move forward
    public void moveNext() {
        if(current != null && current.next != null) {
            current = current.next;
            displayCurrent();
        }else{
            System.out.println("Already at last compartment");
        }
    }

    //Move backward
    public void movePrevious() {
        if(current!=null && current.prev!=null) {
            current = current.prev;
            displayCurrent();
        }else {
            System.out.println("Already at first compartment");
        }
    }

    //Remove a compartment
    public void removeCompartment(String name) {
        Compartment temp = head;

        while(temp != null) {
            if(temp.name.equals(name)) {

                if(temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                }else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                }else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                if(current==temp) current = head;
                System.out.println("Compartment removed: " + name);
                return;
            }
            temp = temp.next;
        }
    }

    public void displayCurrent() {
        System.out.println("Current: "+current.name);

        if(current.prev != null)
            System.out.println("Previous: "+current.prev.name);

        if(current.next != null)
            System.out.println("Next: "+current.next.name);
    }

    //Search for service
    public void searchService(String service) {
        Compartment temp = head;

        while(temp != null) {
            if(service.equalsIgnoreCase("pantry") && temp.hasPantry || 
            		service.equalsIgnoreCase("wifi") && temp.hasWiFi){

                System.out.println(service + " available in " + temp.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println(service+" not found in any compartment");
    }
}
