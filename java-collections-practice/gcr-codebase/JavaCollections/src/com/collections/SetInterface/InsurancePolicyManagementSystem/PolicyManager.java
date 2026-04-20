package com.collections.SetInterface.InsurancePolicyManagementSystem;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager {

    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();
    
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }
    
    public void displayAllPolicies() {
        hashSet.forEach(System.out::println);
    }
    
    public void policiesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        hashSet.stream().filter(p -> !p.getExpiryDate().isBefore(today)
                          && p.getExpiryDate().isBefore(limit)).forEach(System.out::println);
    }
    
    public void policiesByCoverage(String coverageType) {
        hashSet.stream().filter(p -> p.getCoverageType().equalsIgnoreCase(coverageType))
                .forEach(System.out::println);
    }
    
    public void findDuplicates(List<Policy> policies) {

        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for(Policy p : policies) {
            if(!seen.add(p.getPolicyNumber())) {
                duplicates.add(p.getPolicyNumber());
            }
        }
        System.out.println("Duplicate Policy Numbers: "+duplicates);
    }
    
    public void performanceTest(Policy policy) {

        long start, end;

        start = System.nanoTime();
        hashSet.add(policy);
        hashSet.contains(policy);
        hashSet.remove(policy);
        end = System.nanoTime();
        System.out.println("HashSet Time: "+(end-start));

        start = System.nanoTime();
        linkedHashSet.add(policy);
        linkedHashSet.contains(policy);
        linkedHashSet.remove(policy);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Time: "+(end-start));

        start = System.nanoTime();
        treeSet.add(policy);
        treeSet.contains(policy);
        treeSet.remove(policy);
        end = System.nanoTime();
        System.out.println("TreeSet Time: "+(end-start));
    }
}
