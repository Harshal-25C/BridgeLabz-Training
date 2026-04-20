package com.MethodReferences;
import java.util.List;
import java.util.stream.Collectors;

public class InvoiceGenerator {

    public static void main(String[] args) {

        List<Integer> transactionIds = List.of(9001, 9002, 9003);

        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)   // Constructor reference
                .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}

class Invoice {
    int transactionId;

    Invoice(int transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice{transactionId=" + transactionId + "}";
    }
}
