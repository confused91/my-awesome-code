package com.training.designpatterns.strategy.example;

public class TravelByCar implements TravelStrategy {

    @Override
    public float calculateTime(int distance) {
        return distance/100;
    }
}
