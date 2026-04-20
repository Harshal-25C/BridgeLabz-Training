package com.Annotations.PreRequisitesPrograms;

class DeprecatedDemo {

    @Deprecated
    public void oldFeature() {
        System.out.println("Old feature - Do not use");
    }

    public void newFeature() {
        System.out.println("New feature - Use this instead");
    }
}

public class LegacyAPI {

    public static void main(String[] args) {

    	DeprecatedDemo  api = new DeprecatedDemo ();

        api.oldFeature();   
        api.newFeature();
    }
}