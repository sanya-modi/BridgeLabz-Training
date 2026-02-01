package com.functional_interface.data_export;

public class JsonExporter implements DataExporter {

    @Override
    public void export() {
        System.out.println("Exporting data using generic export in JsonExporter");
    }

    @Override
    public void exportToJSON() {
        System.out.println("Exporting data in optimized JSON format");
    }
}
