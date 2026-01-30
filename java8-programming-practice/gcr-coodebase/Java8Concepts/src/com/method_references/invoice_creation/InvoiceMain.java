package com.method_references.invoice_creation;
import java.util.*;

public class InvoiceMain {

    public static void main(String[] args) {

        List<Integer> transactionIds = Arrays.asList(101, 102, 103);

        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)   // constructor reference
                .toList();

        invoices.forEach(System.out::println);
    }
}
