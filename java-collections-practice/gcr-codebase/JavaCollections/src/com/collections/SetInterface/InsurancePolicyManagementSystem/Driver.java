package com.collections.SetInterface.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.*;

public class Driver {

    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        Policy p1 = new Policy("P101", "Amit", LocalDate.now().plusDays(10), "Health", 5000);
        Policy p2 = new Policy("P102", "Neha", LocalDate.now().plusDays(40), "Auto", 3000);
        Policy p3 = new Policy("P103", "Raj", LocalDate.now().plusDays(20), "Home", 7000);

        manager.addPolicy(p1);
        manager.addPolicy(p2);
        manager.addPolicy(p3);

        System.out.println("\nAll Policies:");
        manager.displayAllPolicies();

        System.out.println("\nExpiring Soon:");
        manager.policiesExpiringSoon();

        System.out.println("\nHealth Policies:");
        manager.policiesByCoverage("Health");

        manager.performanceTest(p1);
    }
}
