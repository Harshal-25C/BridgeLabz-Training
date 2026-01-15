package com.day4.DailySalesSummaryReport;

import java.time.LocalDate;
import java.util.*;

public class ZipZipMartApp {

    public static void main(String[] args) {

        List<SalesRecord> records = new ArrayList<>();

        records.add(new SalesRecord("TX101",LocalDate.of(2025, 1, 10), 500));
        records.add(new SalesRecord("TX102",LocalDate.of(2025, 1, 8), 1200));
        records.add(new SalesRecord("TX103",LocalDate.of(2025, 1, 10), 300));
        records.add(new SalesRecord("TX104",LocalDate.of(2025, 1, 8), 1200));

        SalesMergeSort.mergeSort(records);

        System.out.println("---- Daily Sales Summary ----");
        for(SalesRecord r:records) {
            System.out.println(r);
        }
    }
}
