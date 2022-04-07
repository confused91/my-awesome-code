package com.training.testng.booktickets;

public class BusTicket implements Ticket {
    @Override
    public int cost(int quantity) {
        return quantity * 1000;
    }
}
