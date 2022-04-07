package com.training.testng.booktickets;

public class MovieTicket implements Ticket {

    @Override
    public int cost(int quantity) {
        return quantity * 150;
    }

}
