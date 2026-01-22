package com.day10.HospitalQueueManagement;
class HospitalBST {
    private PatientNode root;

    //1 Register Patient
    public void register(int id, String name, int time) {
        root = insertRec(root, id, name, time);
    }

    private PatientNode insertRec(PatientNode root, int id, String name, int time) {
        if(root == null)
            return new PatientNode(id, name, time);

        if(time<root.arrivalTime)
            root.left = insertRec(root.left, id, name, time);
        else
            root.right = insertRec(root.right, id, name, time);

        return root;
    }

    // 2️ Discharge Patient
    public void discharge(int time) {
        root = deleteRec(root, time);
    }

    private PatientNode deleteRec(PatientNode root, int time) {
        if(root == null) return null;

        if(time < root.arrivalTime)
            root.left = deleteRec(root.left, time);
        else if(time > root.arrivalTime)
            root.right = deleteRec(root.right, time);
        else{
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            PatientNode min = findMin(root.right);
            root.arrivalTime = min.arrivalTime;
            root.patientId = min.patientId;
            root.name = min.name;
            root.right = deleteRec(root.right, min.arrivalTime);
        }
        return root;
    }

    private PatientNode findMin(PatientNode node) {
        while (node.left != null)
            node = node.left;
        return node;
    }

    // 3️ Display Patients
    public void display() {
        System.out.println("\nPatients by Arrival Time:");
        inorder(root);
    }

    private void inorder(PatientNode root) {
        if(root != null) {
            inorder(root.left);
            System.out.println("ID: " + root.patientId + ", Name: " + root.name + ", Arrival Time: " + root.arrivalTime);
            inorder(root.right);
        }
    }
}
