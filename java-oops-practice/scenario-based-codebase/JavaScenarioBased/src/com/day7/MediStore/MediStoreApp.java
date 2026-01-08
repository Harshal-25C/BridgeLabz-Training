package com.day7.MediStore;
import java.time.LocalDate;

public class MediStoreApp {

    public static void main(String[] args) {

        Medicine paracetamol = new Tablet(
                "Paracetamol",
                5.0,
                LocalDate.of(2026, 5, 10)
        );

        Medicine coughSyrup = new Syrup(
                "Cough Syrup",
                120.0,
                LocalDate.of(2025, 12, 1),
                30
        );

        Medicine insulin = new Injection(
                "Insulin",
                350.0,
                LocalDate.of(2026, 3, 15)
        );

        paracetamol.sell(10);
        coughSyrup.sell(5);
        insulin.sell(2);
    }
}
