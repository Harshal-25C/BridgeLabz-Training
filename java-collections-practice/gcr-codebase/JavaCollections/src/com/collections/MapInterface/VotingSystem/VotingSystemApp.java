package com.collections.MapInterface.VotingSystem;

import java.util.*;

public class VotingSystemApp {

    private Map<String, Integer> voteMap = new HashMap<>();
    private Map<String, Integer> voteOrder = new LinkedHashMap<>();

    public void vote(String candidate) {
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteMap.get(candidate));
    }

    public void displayVoteOrder() {
        System.out.println("Vote Order:");
        voteOrder.forEach((k, v) ->System.out.println(k +" -> "+v));
    }

    public void displaySortedResults() {
        TreeMap<String, Integer> sortedResults = new TreeMap<>(voteMap);

        System.out.println("\nFinal Results (Sorted):");
        sortedResults.forEach((k, v) -> System.out.println(k+" -> "+v));
    }

    public static void main(String[] args) {

        VotingSystemApp system = new VotingSystemApp();

        system.vote("Alice");
        system.vote("Bob");
        system.vote("Alice");
        system.vote("Charlie");
        system.vote("Bob");

        system.displayVoteOrder();
        system.displaySortedResults();
    }
}
