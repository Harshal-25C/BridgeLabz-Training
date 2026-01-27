package com.interfaces.MarkerInterfaces.CloningPrototypeObjects;

public class CloneTest {
    public static void main(String[] args) throws Exception {

        Vehicle v1 = new Vehicle("Tesla");
        Vehicle v2 = (Vehicle) v1.clone();

        System.out.println(v1.model);
        System.out.println(v2.model);
    }
}
