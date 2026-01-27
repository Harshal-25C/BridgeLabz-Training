package com.interfaces.MarkerInterfaces.DataSerializationForBackup;

import java.io.*;

public class BackupService {

    public static void backup(Object obj) throws Exception {

        if(!(obj instanceof Serializable)) {
            throw new IllegalArgumentException("Object not serializable for backup");
        }

        ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("backup.dat"));

        out.writeObject(obj);
        out.close();

        System.out.println("✅ Backup successful");
    }

    public static void main(String[] args) throws Exception {
        backup(new PatientRecord(1, "Harshal"));
    }
}
