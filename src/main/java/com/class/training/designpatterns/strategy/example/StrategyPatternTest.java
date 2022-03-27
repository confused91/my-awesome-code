package com.epam.classtraining.designpatterns.strategy.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class StrategyPatternTest {
    static Logger logger = LogManager.getLogger(StrategyPatternTest.class);
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static com.epam.classtraining.designpatterns.strategy.example.Travel travel = new com.epam.classtraining.designpatterns.strategy.example.Travel();

    public static void main(String[] args) throws IOException {
        System.out.print("Please enter distance:");
        int distance = Integer.parseInt(reader.readLine());
        travel.setDistance(distance);
        logger.info("Time taken to travel by car is: " + travel.findTravelTime(new com.epam.classtraining.designpatterns.strategy.example.TravelByCar()));
        logger.info("Time taken to travel by foot is: " + travel.findTravelTime(new com.epam.classtraining.designpatterns.strategy.example.TravelByFoot()));
        logger.info("Time taken to travel by two wheeler is: " + travel.findTravelTime(new com.epam.classtraining.designpatterns.strategy.example.TravelByTwoWheeler()));
        new Calendar.Builder()
                .setDate(1991,03,Calendar.DAY_OF_MONTH)
                .build();

    }
}
