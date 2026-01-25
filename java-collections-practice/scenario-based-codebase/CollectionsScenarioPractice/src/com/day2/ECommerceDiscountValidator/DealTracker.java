package com.day2.ECommerceDiscountValidator;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;

public class DealTracker {

    private Map<String, Deal<Integer>> dealMap = new HashMap<>();
    private Set<String> dealCodes = new HashSet<>();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    // Regex patterns
    private Pattern dealCodePattern = Pattern.compile("DealCode:\\s*(\\w+)");
    private Pattern validTillPattern = Pattern.compile("ValidTill:\\s*(\\d{2}-\\d{2}-\\d{4})");
    private Pattern discountPattern = Pattern.compile("Discount:\\s*(\\d+)%");
    private Pattern minimumPurchasePattern = Pattern.compile("MinimumPurchase:\\s*(\\d+)");

    public void loadDeals(String filename) {
        try (FileInputStream fis = new FileInputStream(filename);
             BufferedReader reader = new BufferedReader(new InputStreamReader(fis))) {

            String line;
            String dealCode = null, validTillStr = null;
            Integer discount = null;
            Double minPurchase = null;

            while ((line = reader.readLine()) != null) {
                Matcher m;

                m = dealCodePattern.matcher(line);
                if (m.find()) dealCode = m.group(1);

                m = validTillPattern.matcher(line);
                if (m.find()) validTillStr = m.group(1);

                m = discountPattern.matcher(line);
                if (m.find()) discount = Integer.parseInt(m.group(1));

                m = minimumPurchasePattern.matcher(line);
                if (m.find()) minPurchase = Double.parseDouble(m.group(1));

                // When we reach a blank line or end of file, create Deal object
                if (line.isBlank() || reader.ready() == false) {
                    if (dealCode != null && validTillStr != null && discount != null && minPurchase != null) {
                        LocalDate validTill = LocalDate.parse(validTillStr, formatter);
                        if (!dealCodes.contains(dealCode) && validTill.isAfter(LocalDate.now())) {
                            Deal<Integer> deal = new Deal<>(dealCode, validTill, discount, minPurchase);
                            dealMap.put(dealCode, deal);
                            dealCodes.add(dealCode);
                        }
                    }
                    dealCode = null;
                    validTillStr = null;
                    discount = null;
                    minPurchase = null;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void printAllDeals() {
        dealMap.values().forEach(System.out::println);
    }

    public void printSortedByDiscount() {
        dealMap.values().stream()
                .sorted(Comparator.comparingInt(d -> d.getDiscountOrValue()))
                .forEach(System.out::println);
    }


    public Map<String, Deal<Integer>> getDealMap() {
        return dealMap;
    }
}

