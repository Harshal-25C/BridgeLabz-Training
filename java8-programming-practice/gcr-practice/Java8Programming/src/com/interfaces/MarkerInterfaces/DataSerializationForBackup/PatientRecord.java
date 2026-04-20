package com.interfaces.MarkerInterfaces.DataSerializationForBackup;

import java.io.Serializable;

class PatientRecord implements Serializable {

    private int id;
    private String name;

    public PatientRecord(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
