package com.functional_interface.data_export;

public class PdfExporter implements DataExporter {

    @Override
    public void export() {
        System.out.println("Exporting data to PDF");
    }
}
