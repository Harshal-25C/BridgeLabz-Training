package com.day4.TicketPriceOptimizer;

public class EventManagerApp {

    public static void main(String[] args) {

        Ticket[] tickets = {
                new Ticket(1, 2500),
                new Ticket(2, 1500),
                new Ticket(3, 5000),
                new Ticket(4, 999),
                new Ticket(5, 3000)
        };

        TicketQuickSort.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("Top Cheapest Tickets:");
        for(int i=0; i<Math.min(3, tickets.length); i++) {
            System.out.println(tickets[i]);
        }
    }
}
