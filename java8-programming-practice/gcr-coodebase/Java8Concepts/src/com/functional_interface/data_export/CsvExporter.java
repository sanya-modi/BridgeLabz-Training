package com.functional_interface.data_export;

public class CsvExporter implements DataExporter {

    @Override
    public void export() {
        System.out.println("Exporting data to CSV");
    }
}
