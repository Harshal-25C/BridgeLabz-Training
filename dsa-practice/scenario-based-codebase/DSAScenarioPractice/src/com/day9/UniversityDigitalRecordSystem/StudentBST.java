package com.day9.UniversityDigitalRecordSystem;

class StudentBST {

    Student root;

    // 1️ Insert
    public void insert(int rollNo, String name, String department) {
        root = insertRec(root, rollNo, name, department);
    }

    private Student insertRec(Student root, int rollNo, String name, String department) {
        if(root == null) {
            return new Student(rollNo, name, department);
        }

        if(rollNo < root.rollNo) {
            root.left = insertRec(root.left, rollNo, name, department);
        }else if (rollNo > root.rollNo) {
            root.right = insertRec(root.right, rollNo, name, department);
        }else {
            System.out.println("Duplicate roll number not allowed!");
        }
        return root;
    }

    // 2️ Delete
    public void delete(int rollNo) {
        root = deleteRec(root, rollNo);
    }

    private Student deleteRec(Student root, int rollNo) {
        if(root == null) {
            System.out.println("Student not found!");
            return null;
        }

        if(rollNo < root.rollNo) {
            root.left = deleteRec(root.left, rollNo);
        }else if (rollNo > root.rollNo) {
            root.right = deleteRec(root.right, rollNo);
        }else {
            // Node found
            if(root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            Student successor = minValueNode(root.right);
            root.rollNo = successor.rollNo;
            root.name = successor.name;
            root.department = successor.department;

            root.right = deleteRec(root.right, successor.rollNo);
        }
        return root;
    }

    private Student minValueNode(Student node) {
        Student current = node;
        while(current.left != null)
            current = current.left;
        return current;
    }

    // 3️ Search
    public void search(int rollNo) {
        Student result = searchRec(root, rollNo);
        if(result != null) {
            System.out.println("Student Found:");
            displayStudent(result);
        }else{
            System.out.println("Student not found!");
        }
    }

    private Student searchRec(Student root, int rollNo) {
        if(root==null || root.rollNo==rollNo)
            return root;

        if(rollNo < root.rollNo)
            return searchRec(root.left, rollNo);

        return searchRec(root.right, rollNo);
    }

    // Display all students (Sorted)
    public void displayAll() {
        if(root == null) {
            System.out.println("No student records available.");
            return;
        }
        System.out.println("Student Records (Sorted by Roll Number):");
        inorder(root);
    }

    private void inorder(Student root) {
        if(root != null) {
            inorder(root.left);
            displayStudent(root);
            inorder(root.right);
        }
    }

    private void displayStudent(Student s) {
        System.out.println(
                "RollNo: " + s.rollNo +
                ", Name: " + s.name +
                ", Department: " + s.department
        );
    }
}