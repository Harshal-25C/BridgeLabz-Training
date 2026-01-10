package com.day1.EmergencyPatientNavigation;

public class AmbulanceRoute {

    private UnitNode head = null;
    private UnitNode tail = null;

    //Add hospital unit
    public void addUnit(String name, boolean isAvailable) {
        UnitNode newNode = new UnitNode(name, isAvailable);

        if(head == null) {
            head=tail=newNode;
            tail.next=head;
        }else{
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
    }

    //Find nearest available unit
    public void findNearestAvailableUnit() {
        if(head == null) {
            System.out.println("No hospital units available");
            return;
        }

        UnitNode temp=head;
        do{
            if(temp.isAvailable){
                System.out.println("Patient redirected to: " + temp.unitName);
                return;
            }
            temp=temp.next;
        }while(temp != head);

        System.out.println("No available units at the moment");
    }

    //Remove unit under maintenance
    public void removeUnit(String unitName) {
        if (head == null) return;

        UnitNode current = head;
        UnitNode previous = tail;

        do{
            if(current.unitName.equals(unitName)) {

                if(current==head){
                    head=head.next;
                    tail.next=head;
                }else if(current==tail){
                    tail = previous;
                    tail.next = head;
                }else{
                    previous.next = current.next;
                }

                System.out.println(unitName + " is under maintenance and removed");
                return;
            }
            previous = current;
            current = current.next;
        }while(current != head);
    }

    public void displayUnits() {
        if(head == null) return;

        UnitNode temp = head;
        do{
            System.out.print(temp.unitName + " → ");
            temp = temp.next;
        } while(temp != head);
        System.out.println("(back to " + head.unitName + ")");
    }
}
