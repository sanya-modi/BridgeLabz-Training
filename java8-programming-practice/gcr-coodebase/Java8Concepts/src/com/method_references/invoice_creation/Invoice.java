package com.method_references.invoice_creation;

public class Invoice {
	
	int transactionId;

    public Invoice(int transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice [transactionId=" + transactionId + "]";
    }
}
