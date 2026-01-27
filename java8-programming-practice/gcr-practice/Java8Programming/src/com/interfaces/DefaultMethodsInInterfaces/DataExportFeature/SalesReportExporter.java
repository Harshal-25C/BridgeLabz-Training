package com.interfaces.DefaultMethodsInInterfaces.DataExportFeature;

class SalesReportExporter implements ReportExporter {

    public void exportToCSV() {
        System.out.println("Exported Sales Report to CSV");
    }

    public void exportToPDF() {
        System.out.println("Exported Sales Report to PDF");
    }
}
