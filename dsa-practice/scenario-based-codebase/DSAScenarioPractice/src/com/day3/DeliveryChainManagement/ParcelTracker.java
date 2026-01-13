package com.day3.DeliveryChainManagement;

public class ParcelTracker {

    private StageNode head;

    //Initialize default stages
    public ParcelTracker() {
        head = new StageNode("Packed");
        head.next = new StageNode("Shipped");
        head.next.next = new StageNode("In Transit");
        head.next.next.next = new StageNode("Delivered");
    }

    public void trackParcel() {
        StageNode temp = head;
        while(temp != null) {
            System.out.print(temp.stage+" → ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    //Add custom checkpoint after a stage
    public void addCheckpoint(String afterStage, String newStage) {
        StageNode temp = head;
        while(temp!=null) {
            if(temp.stage.equals(afterStage)) {
                StageNode newNode = new StageNode(newStage);
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Stage not found");
    }

    //Handle lost/missing parcel
    public void markLost() {
        head = null;
        System.out.println("Parcel lost – tracking terminated");
    }
}
