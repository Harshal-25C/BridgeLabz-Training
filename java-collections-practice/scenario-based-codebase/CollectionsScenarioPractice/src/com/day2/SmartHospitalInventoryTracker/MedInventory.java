package com.day2.SmartHospitalInventoryTracker;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.time.*;

public class MedInventory<T> {

    private static final Pattern DATE_PATTERN = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

    public Map<String, List<Item<T>>> processInventory(String filePath) throws Exception {

        Map<String, List<Item<T>>> categoryMap = new HashMap<>();
        Set<Item<T>> uniqueItems = new HashSet<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        while((line = br.readLine()) != null) {
            try {
                String[] parts = line.split(",");

                String id = parts[0];
                T name = (T) parts[1];
                int qty = Integer.parseInt(parts[2]);
                String expiry = parts[3];

                validateExpiry(expiry);

                if(qty < 5) {
                    throw new LowStockException(
                            "Critical stock low for item: " + id);
                }

                Item<T> item = new Item<>(id, name, qty, expiry);
                uniqueItems.add(item);

                categoryMap.computeIfAbsent(parts[1], k -> new ArrayList<>()).add(item);

            }catch (LowStockException e) {
                System.out.println(e.getMessage());
            }catch (Exception e) {
                System.out.println("Skipping invalid entry: " + line);
            }
        }
        br.close();

        return categoryMap;
    }

    private void validateExpiry(String date) throws Exception {
        if(!DATE_PATTERN.matcher(date).matches()) {
            throw new Exception("Invalid expiry format");
        }

        LocalDate exp = LocalDate.parse(date, java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        if(exp.isBefore(LocalDate.now())) {
            throw new Exception("Expired item detected");
        }
    }
}
