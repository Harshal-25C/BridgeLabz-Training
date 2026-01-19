package com.day7.DailyStepCountRanking;

public class FitnessTrackerApp {

    //Bubble Sort by steps (DESCENDING)
    public static void bubbleSort(User[] users) {
        int n = users.length;

        for(int i=0; i<n-1; i++) {
            boolean swapped = false;

            for(int j=0; j<n-i-1; j++) {
                if (users[j].steps < users[j+1].steps) {
                    User temp = users[j];
                    users[j] = users[j+1];
                    users[j+1] = temp;
                    swapped = true;
                }
            }
            
            if(!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        User[] users = {
            new User(1, "Harshal", 8500),
            new User(2, "Ayush", 12000),
            new User(3, "Devarshi", 10000),
            new User(4, "John", 7000),
            new User(5, "Ron", 9500)
        };

        System.out.println("Before Ranking:");
        for(User u:users) {
            System.out.println(u);
        }

        bubbleSort(users);

        System.out.println("\nDaily Step Count Ranking:");
        int rank = 1;
        for(User u:users) {
            System.out.println("Rank " + rank++ + " -> " + u);
        }
    }
}
