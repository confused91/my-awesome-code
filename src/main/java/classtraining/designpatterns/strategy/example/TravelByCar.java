package classtraining.designpatterns.strategy.example;

import java.time.LocalTime;

public class TravelByCar implements TravelStrategy{

    @Override
    public float calculateTime(int distance) {
        return distance/100;
    }
}
