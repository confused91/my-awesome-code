package classtraining.designpatterns.strategy.example;

public class TravelByFoot implements TravelStrategy{
    @Override
    public float calculateTime(int distance) {
        return distance/5;
    }
}
