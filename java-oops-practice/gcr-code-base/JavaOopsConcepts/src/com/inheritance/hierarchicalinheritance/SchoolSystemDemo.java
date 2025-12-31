package com.inheritance.hierarchicalinheritance;

public class SchoolSystemDemo{
    public static void main(String[] args) {

        Teacher t = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student s = new Student("Aarav", 16, "10th");
        Staff st = new Staff("Ramesh", 45, "Administration");

        t.displayRole();
        System.out.println();

        s.displayRole();
        System.out.println();

        st.displayRole();
    }
}

