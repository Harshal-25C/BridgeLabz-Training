package com.interfaces.DefaultMethodsInInterfaces.DataExportFeature;

public class ReportApp {
    public static void main(String[] args) {
        ReportExporter exporter = new SalesReportExporter();
        exporter.exportToJSON();   // works without modifying class
    }
}
