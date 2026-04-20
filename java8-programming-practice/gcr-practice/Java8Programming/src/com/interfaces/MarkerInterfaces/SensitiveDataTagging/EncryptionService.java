package com.interfaces.MarkerInterfaces.SensitiveDataTagging;

public class EncryptionService {

    public static void process(Object obj) {

        if(obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data...");
        }else {
            System.out.println("No encryption needed");
        }
    }

    public static void main(String[] args) {
        process(new CreditCardInfo("1234-5678-9999"));
        process("Normal String");
    }
}
