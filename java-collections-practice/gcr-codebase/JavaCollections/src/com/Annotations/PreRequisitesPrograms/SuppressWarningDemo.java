package com.Annotations.PreRequisitesPrograms;

import java.util.*;

public class SuppressWarningDemo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ArrayList list = new ArrayList();   
        list.add("Java");
        list.add(100);

        System.out.println(list);
    }
}