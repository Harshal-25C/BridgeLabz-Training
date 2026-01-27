package com.interfaces.DefaultMethodsInInterfaces.DataExportFeature;

interface ReportExporter {

    void exportToCSV();
    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exporting report to JSON (default)");
    }
}
