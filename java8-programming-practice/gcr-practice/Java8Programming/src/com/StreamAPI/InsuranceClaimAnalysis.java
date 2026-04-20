package com.StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

class InsuranceClaim {
    private String claimType;
    private double amount;

    public InsuranceClaim(String claimType, double amount) {
        this.claimType = claimType;
        this.amount = amount;
    }

    public String getClaimType() {
        return claimType;
    }

    public double getAmount() {
        return amount;
    }
}

public class InsuranceClaimAnalysis {

    public static void main(String[] args) {

        List<InsuranceClaim> claims = Arrays.asList(
                new InsuranceClaim("Health", 45000),
                new InsuranceClaim("Vehicle", 20000),
                new InsuranceClaim("Health", 55000),
                new InsuranceClaim("Vehicle", 30000),
                new InsuranceClaim("Life", 100000)
        );

        Map<String, Double> averageClaimAmount = claims.stream()
                      .collect(Collectors.groupingBy(InsuranceClaim::getClaimType,
                              Collectors.averagingDouble(InsuranceClaim::getAmount)
                      ));

        averageClaimAmount.forEach((type, avg) ->
                System.out.println(type + " → " + avg)
        );
    }
}
