package com.functional_interface.date_format_utility;

import java.time.LocalDate;

public class InvoiceGenerator {

    public static void main(String[] args) {

        LocalDate invoiceDate = LocalDate.now();

        String format1 = DateUtils.formatDate(invoiceDate, "dd-MM-yyyy");
        String format2 = DateUtils.formatDate(invoiceDate, "yyyy/MM/dd");
        String format3 = DateUtils.formatDate(invoiceDate, "dd MMM YYYYYY");
        String format4 = DateUtils.formatDate(invoiceDate, "DD:MMMM");

        System.out.println("Invoice Date (dd-MM-yyyy): " + format1);
        System.out.println("Invoice Date (yyyy/MM/dd): " + format2);
        System.out.println("Invoice Date (dd MMM yyyy): " + format3);
        System.out.println("Invoice Date (dd:MMMM ): " + format4);
    }
}
