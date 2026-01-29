package com.StreamAPI;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class Member {
    private String name;
    private LocalDate expiryDate;

    public Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return name+" - Expires on: "+expiryDate;
    }
}

public class FilteringMembershipExpiry {

    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
                new Member("Amit", LocalDate.now().plusDays(10)),
                new Member("Neha", LocalDate.now().plusDays(45)),
                new Member("Rahul", LocalDate.now().plusDays(25)),
                new Member("Sneha", LocalDate.now().plusDays(5))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<Member> expiringSoon = members.stream()
                .filter(m -> m.getExpiryDate().isAfter(today))
                .filter(m -> m.getExpiryDate().isBefore(next30Days))
                .collect(Collectors.toList());

        expiringSoon.forEach(System.out::println);
    }
}
