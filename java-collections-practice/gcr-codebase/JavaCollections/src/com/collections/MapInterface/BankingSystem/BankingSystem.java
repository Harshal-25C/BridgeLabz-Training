package com.collections.MapInterface.BankingSystem;
import java.util.*;

public class BankingSystem {

    //AccountNumber -> Balance
    private Map<String, Double> accounts = new HashMap<>();

    //Withdrawal requests (FIFO)
    private Queue<String> withdrawalQueue = new LinkedList<>();

    public void addAccount(String accountNumber, double balance) {
        accounts.put(accountNumber, balance);
    }

    public void requestWithdrawal(String accountNumber) {
        withdrawalQueue.add(accountNumber);
    }

    //Process withdrawal queue
    public void processWithdrawals(double amount) {

        while(!withdrawalQueue.isEmpty()) {
            String acc = withdrawalQueue.poll();

            double balance = accounts.getOrDefault(acc, 0.0);

            if(balance >= amount) {
                accounts.put(acc, balance-amount);
                System.out.println("Withdrawal successful for "+acc);
            }else {
                System.out.println("Insufficient balance for "+acc);
            }
        }
    }

    public void displaySortedByBalance() {

        TreeMap<Double, List<String>> sortedAccounts = new TreeMap<>();

        for(Map.Entry<String, Double> entry : accounts.entrySet()) {
            sortedAccounts.computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
                .add(entry.getKey());
        }

        System.out.println("\nAccounts Sorted by Balance:");
        sortedAccounts.forEach((balance, accs) -> {
            for(String acc:accs) {
                System.out.println(acc+" -> ₹"+balance);
            }
        });
    }

    public static void main(String[] args) {

        BankingSystem bank = new BankingSystem();

        bank.addAccount("ACC101", 10000);
        bank.addAccount("ACC102", 5000);
        bank.addAccount("ACC103", 15000);

        bank.requestWithdrawal("ACC101");
        bank.requestWithdrawal("ACC102");

        bank.processWithdrawals(3000);
        bank.displaySortedByBalance();
    }
}
