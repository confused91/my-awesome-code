package com.epam.classtraining.designpatterns.strategy.example;

public class TravelByCar implements com.epam.classtraining.designpatterns.strategy.example.TravelStrategy {

    @Override
    public float calculateTime(int distance) {
        return distance/100;
    }
}
