package com.epam.classtraining.designpatterns.strategy.example;

public class TravelByTwoWheeler implements TravelStrategy{
    @Override
    public float calculateTime(int distance) {
        return distance/60;
    }
}
