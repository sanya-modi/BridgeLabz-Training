package com.functional_interface.data_export;

public interface DataExporter {

    void export();   // existing abstract method

    // Newly added feature
    default void exportToJSON() {
        System.out.println("Exporting data in JSON format (default implementation)");
    }
}
