package com.day1.TabHistoryManager;

class Tab {
    private HistoryNode current;

    public void visit(String url) {
        HistoryNode newNode = new HistoryNode(url);

        if(current!=null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;
        System.out.println("Visited: "+url);
    }

    public void back() {
        if(current!=null && current.prev!=null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        }else {
            System.out.println("No previous page");
        }
    }

    public void forward() {
        if(current != null && current.next != null) {
            current = current.next;
            System.out.println("Forward to: "+current.url);
        }else{
            System.out.println("No next page");
        }
    }

    public String getCurrentPage() {
        return current != null ? current.url :"Empty Tab";
    }
}
