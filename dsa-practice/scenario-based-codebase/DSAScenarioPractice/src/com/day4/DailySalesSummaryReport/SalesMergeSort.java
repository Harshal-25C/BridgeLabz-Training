package com.day4.DailySalesSummaryReport;
import java.util.*;

public class SalesMergeSort {

    public static void mergeSort(List<SalesRecord> records) {
        if(records.size() <= 1) return;

        int mid = records.size()/2;

        List<SalesRecord> left = new ArrayList<>(records.subList(0, mid));
        List<SalesRecord> right = new ArrayList<>(records.subList(mid, records.size()));

        mergeSort(left);
        mergeSort(right);

        merge(records, left, right);
    }

    //Stable merge logic
    private static void merge(List<SalesRecord> result, List<SalesRecord> left, List<SalesRecord> right) {

        int i=0, j=0, k=0;

        while(i<left.size() && j<right.size()) {

            SalesRecord l = left.get(i);
            SalesRecord r = right.get(j);

            if(l.getDate().isBefore(r.getDate()) ||(l.getDate().isEqual(r.getDate()) && l.getAmount() <= r.getAmount())) {

                //Stability preserved by <=
                result.set(k++, left.get(i++));
            }else {
                result.set(k++, right.get(j++));
            }
        }

        while(i<left.size()) {
            result.set(k++, left.get(i++));
        }

        while(j<right.size()) {
            result.set(k++, right.get(j++));
        }
    }
}
