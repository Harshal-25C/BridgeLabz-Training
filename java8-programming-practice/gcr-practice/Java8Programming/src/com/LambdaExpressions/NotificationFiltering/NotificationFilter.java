package com.LambdaExpressions.NotificationFiltering;

import java.util.List;
import java.util.function.Predicate;

public class NotificationFilter {

    public static void main(String[] args) {

        List<Alert> alerts = List.of(
                new Alert("CRITICAL", "Heart rate abnormal"),
                new Alert("INFO", "Appointment reminder"),
                new Alert("WARNING", "Blood pressure high")
        );

        Predicate<Alert> criticalOnly = alert -> alert.type.equals("CRITICAL");

        alerts.stream().filter(criticalOnly)
                .forEach(System.out::println);
    }
}
